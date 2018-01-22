package com.xiaofeng.easyword.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {
    public static boolean createDir(File file){
        if (file == null)   return false;
        if (file.exists()){
            if (file.isFile())  return file.mkdirs();
            else    return true;
        }else {
            return file.mkdirs();
        }
    }

    public static boolean createFile(File file){
        try {
            return file != null && (file.exists() ? file.isFile() : file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean writeISToFile(File file, InputStream is){
        if (!createFile(file) || is == null) return false;
        try {
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(file));
            int len;
            byte temp[] = new byte[2048];
            while ((len = is.read(temp)) > 0){
                os.write(temp,0,len);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
