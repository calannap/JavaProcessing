/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newProject;

import java.awt.image.BufferedImage;
import java.awt.image.Kernel;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class RichardsonLucyFilter
{
    Kernel K;
    int iterations;
    int [] originalPixels; // we need this on each iteration
    
    public RichardsonLucyFilter(Kernel K, int iterations)
    {
     this.K = K;
     this.iterations = iterations;
    }
    
 static BufferedImage deepCopy(BufferedImage bi) {
  ColorModel cm = bi.getColorModel();
  boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
  WritableRaster raster = bi.copyData(null);
  return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
}
 
 private BufferedImage addAlpha(BufferedImage img)
 {
        ColorModel colorModel = ColorModel.getRGBdefault(); 
        WritableRaster raster = colorModel.createCompatibleWritableRaster(img.getWidth(), img.getHeight());

        Raster inRaster = img.getRaster();
        int[] pixels = inRaster.getPixels(0, 0, raster.getWidth(), raster.getHeight(), (int[]) null);
        
        int [] newPixels = new int[4*img.getWidth()*img.getHeight()];
        
        for(int i=0;i<img.getWidth()*img.getHeight();i++)
        {
            int gray = (pixels[i*3]+pixels[i*3+1]+pixels[i*3+2])/3;

            
            // for rgb image:
            newPixels[i*4] = pixels[i*3];
            newPixels[i*4+1] = pixels[i*3+1];
            newPixels[i*4+2] = pixels[i*3+2];
            newPixels[i*4+3] = 255;
        }
        
        originalPixels = new int[4*img.getWidth()*img.getHeight()];
        for(int i=0;i<img.getWidth()*img.getHeight()*4;i++)
            originalPixels[i] = newPixels[i];

        raster.setPixels(0, 0, img.getWidth(), img.getHeight(), newPixels);      
        BufferedImage image = new BufferedImage(colorModel, raster, true, null);        

        return image;     
 }
 
 float computeCI(int i, int j,  // computes Ci around point i,j
                 int [] u,      // current image
                 float  [] k,
                 int w,
                 int h,
                 float KDivisor,
                 int channel      // 0 for Red, 1 for Green, 2 for Blue
                 )
 {
  int kw = K.getWidth();
  int kh = K.getHeight();
     
  float r = 0.f;
  if(i>kh/2 && i<h-kh/2 && // check if we can apply the Kernel
     j>kw/2 && j<w-kw/2)
  {
//      int ri = i-K.getHeight()/2;
 //     int rj = j-K.getHeight()/2;
      for(int ik=0;ik<kh;ik++)
      {
          for(int jk=0;jk<kw;jk++)
          {
           r += k[ik*kw+jk] * u[4*((i+ik-kh/2)*w+j+jk-kw/2)+channel];
          }
      }
      r /= KDivisor;
  }  
  return r;
 }
 
    private BufferedImage oneStep(BufferedImage img)
    {
        ColorModel colorModel = ColorModel.getRGBdefault(); 
        WritableRaster raster = colorModel.createCompatibleWritableRaster(img.getWidth(), img.getHeight());

        Raster inRaster = img.getRaster();
        int[] pixels = inRaster.getPixels(0, 0, raster.getWidth(), raster.getHeight(), (int[]) null);
        
        /*
        for(int i=0;i<raster.getHeight();i++)
        {
         for(int j=0;j<raster.getWidth();j++)
         {
             pixels[i*4] = 128;
             pixels[i*4+1] = 128;
             pixels[i*4+2] = 128;
             pixels[i*4+3] = 255;
         }
        }
        */
        int[] newPixels = new int[raster.getWidth()*raster.getHeight()*4];
        
        float totalK = 0.f;
        float [] kernelData = new float[K.getWidth() * K.getHeight()];
        K.getKernelData(kernelData);
        for(int i=0;i<K.getHeight()*K.getWidth();i++)
        {
            totalK += kernelData[i];
        }
        
        int kw = K.getWidth();
        int kh = K.getHeight();
        
        for(int i=0; i<img.getHeight(); i++)
        {
         for(int j=0;j<img.getWidth();j++)
         {
             // check if we can apply the Kernel K
             if(i>=K.getHeight()/2 && i<img.getHeight()-K.getHeight()/2 &&
                j>=K.getWidth()/2 && j<img.getWidth()-K.getWidth()/2)
             {
                 float acR = 0;
                 float acG = 0;
                 float acB = 0;
                 for(int ik=0;ik<K.getHeight();ik++)
                 {
                  for(int jk=0;jk<K.getWidth();jk++)
                  {
                      float ciR = computeCI(ik+i-K.getHeight()/2, jk+j-K.getWidth()/2,
                              pixels,
                              kernelData,
                              img.getWidth(),
                              img.getHeight(),
                              totalK,
                              0
                              );
                      float ciG = computeCI(ik+i-K.getHeight()/2, jk+j-K.getWidth()/2,
                              pixels,
                              kernelData,
                              img.getWidth(),
                              img.getHeight(),
                              totalK
                              ,1
                              );
                      float ciB = computeCI(ik+i-K.getHeight()/2, jk+j-K.getWidth()/2,
                              pixels,
                              kernelData,
                              img.getWidth(),
                              img.getHeight(),
                              totalK
                              ,2
                              );
                      
                     // ciB =1.f;
                     // ciR = 1.f;
                     // ciG = 1.f;
                      if(ciR>1e-5f)
                        acR += kernelData[ik*kw+jk] * (float)originalPixels[((i+ik-kh/2)*img.getWidth()+j+jk-kw/2)*4] / ciR;
                      if(ciG>1e-5f)
                        acG += kernelData[ik*kw+jk] * (float)originalPixels[((i+ik-kh/2)*img.getWidth()+j+jk-kw/2)*4+1] / ciG;
                      if(ciB>1e-5f)
                        acB += kernelData[ik*kw+jk] * (float)originalPixels[((i+ik-kh/2)*img.getWidth()+j+jk-kw/2)*4+2] / ciB;
                  }
                 }
                 //acR = acG = acB = 1.f;
                // totalK = 1.f;
                 newPixels[(i*img.getWidth()+j)*4] =   (int)(acR/totalK * (float)pixels[(i*img.getWidth()+j)*4]);
                 newPixels[(i*img.getWidth()+j)*4+1] = (int)(acG/totalK * (float)pixels[(i*img.getWidth()+j)*4+1]);               
                 newPixels[(i*img.getWidth()+j)*4+2] = (int)(acB/totalK * (float)pixels[(i*img.getWidth()+j)*4+2]);
                 newPixels[(i*img.getWidth()+j)*4+3] = pixels[(i*img.getWidth()+j)*4+3];
                 
                 if(newPixels[(i*img.getWidth()+j)*4]>255)
                  newPixels[(i*img.getWidth()+j)*4] = 255;
                  
                 if(newPixels[(i*img.getWidth()+j)*4+1]>255)
                  newPixels[(i*img.getWidth()+j)*4+1] = 255;
                 
                 if(newPixels[(i*img.getWidth()+j)*4+2]>255)
                  newPixels[(i*img.getWidth()+j)*4+2] = 255;
//                  System.out.println(newPixels[(i*img.getWidth()+j)*4]);
                 
                 
             }
             else // cannot apply the kernel
             {
              newPixels[(i*img.getWidth()+j)*4] = pixels[(i*img.getWidth()+j)*4];
              newPixels[(i*img.getWidth()+j)*4+1] = pixels[(i*img.getWidth()+j)*4+1];
              newPixels[(i*img.getWidth()+j)*4+2] = pixels[(i*img.getWidth()+j)*4+2];
              newPixels[(i*img.getWidth()+j)*4+3] = pixels[(i*img.getWidth()+j)*4+3];
             }
          //   int offset1 = (i*img.getWidth()+j)*4;             
         }
        }

        raster.setPixels(0, 0, img.getWidth(), img.getHeight(), newPixels);      
        BufferedImage image = new BufferedImage(colorModel, raster, true, null);        

        return image;
    }
    
    public BufferedImage apply(BufferedImage img)
    {
      BufferedImage result = deepCopy(img);
      result = addAlpha(result);
      for(int i=0;i<iterations;i++)
      {
          result = oneStep(result);
      }
      return result;
    }
}
