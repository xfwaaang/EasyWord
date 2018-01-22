package com.xiaofeng.easyword.utils;

import android.content.Context;
import android.os.Environment;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.File;
import java.io.IOException;

public class OkHttpUtils {
    private OkHttpClient mOkHttpClient;
    private static OkHttpUtils mOkHttpUtils;

    public OkHttpUtils(){
        mOkHttpClient = new OkHttpClient();
    }

    public static OkHttpUtils getInstance(){
        if (mOkHttpUtils == null){
            synchronized (OkHttpUtils.class){
                if (mOkHttpUtils == null){
                    mOkHttpUtils = new OkHttpUtils();
                }
            }
        }
        return mOkHttpUtils;
    }

    public Call get(String url){
        Request request = new Request.Builder().url(url).build();
        return mOkHttpClient.newCall(request);
    }

    public Call post(String url, RequestBody formBody){
        Request request = new Request.Builder().url(url).post(formBody).build();
        return mOkHttpClient.newCall(request);
    }

    public void download(String url, String fileName){
        String rootPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        File rootDir = new File(rootPath,"EasyWord");
        if (!FileUtils.createDir(rootDir))  return;

        final File file = new File(rootDir.getAbsolutePath(),fileName);
    }
}
