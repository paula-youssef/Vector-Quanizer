
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Com {

	public static int width;
    public static int height;
    ArrayList<double[][]> arr = new ArrayList<double[][]>();
    public static int[][] pixels;
//-----------------------------------------------------------------------------------
    public Com(){
    	width=0;
    	height=0;
    }
//---------------------------------(read image)--------------------------------------
    public void readImage(String filePath){
        File file=new File(filePath);
        BufferedImage image=null;
        try
        {
            image=ImageIO.read(file);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

          width=image.getWidth();
          height=image.getHeight();
            pixels=new int[height][width];

        for(int x=0;x<width;x++)
        {
            for(int y=0;y<height;y++)
            {
                int rgb=image.getRGB(x, y);
                int alpha=(rgb >> 24) & 0xff;
                int r = (rgb >> 16) & 0xff;
                int g = (rgb >> 8) & 0xff;
                int b = (rgb >> 0) & 0xff;

                pixels[y][x]=r;
            }
        }
    }
//---------------------------(split big Matrix to vectors )----------------------------------------------------
    public void splitvectors (int h, int w){
    for ( int h0 = 0 ; h0 < height ; h0++ ){
    	for ( int h1 = 0 ;)
    }
    }
//-----------------------------(write to file)-------------------------------------
    public void writeToFile(){
    	try {
            File file = new File("compressedData.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            
           /* output.write(String.valueOf(width));
            output.newLine();;
            output.write(String.valueOf(height));
            output.newLine();
            output.write(String.valueOf(infList.size()));
            output.newLine();
            //output.write("|");
            
            for(int i = 0 ; i < infList.size() ; i++){
            	output.write(String.valueOf(infList.get(i).name));
            	output.newLine();
            	output.write(String.valueOf(infList.get(i).start));
            	output.newLine();
            	output.write(String.valueOf(infList.get(i).end));
            	output.newLine();
            	output.write(String.valueOf(infList.get(i).mid));
            	output.newLine();
            	}
            
            //output.write("||");
            
            for( int w = 0 ; w < width ; w++ ){
            	for( int h = 0 ; h < height ; h++ ){
            		for( int lis = 0 ; lis < infList.size() ; lis++ ){
            			if( pixelRange[w][h] == infList.get(lis).mid){
            				output.write(String.valueOf(infList.get(lis).name));
            				output.newLine();
            			}
            		}
            	}
            }
            output.close();*/
    	}catch ( IOException e ) {
            e.printStackTrace();
         }
    }


}
