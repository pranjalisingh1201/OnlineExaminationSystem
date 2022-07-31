/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBman;

import com.oreilly.servlet.multipart.FileRenamePolicy;
import java.io.File;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author DELL
 */
public class Renamefile implements FileRenamePolicy
{ public String MyFileName;

    @Override
    public File rename(File f) {
        String folderName=f.getParent();
        String fileName=f.getName();
        String fileExt=fileName.substring(fileName.lastIndexOf('.'));
        fileName=fileName.substring(0,fileName.lastIndexOf('.'));
    Random r=new Random();
    fileName=fileName+r.nextInt(1000);
    Date dt=new Date();
    String  datetime=dt.getDate()+"-"+dt.getMonth()+"-"+dt.getYear()+"-"+dt.getSeconds();
    fileName=fileName+datetime+fileExt;
    MyFileName=fileName;
    String fullPath=folderName+"\\"+fileName;
    File myf=new File(fullPath);
    return myf;
    }
}
