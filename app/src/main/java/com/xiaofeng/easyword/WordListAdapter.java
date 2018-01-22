package com.xiaofeng.easyword;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xiaofeng.easyword.beans.Means;
import com.xiaofeng.easyword.beans.Message;

import java.util.List;

public class WordListAdapter extends BaseAdapter {
    private List<Message> mMessageList;
    private LayoutInflater mInflater;
    private Context mContext;

    public WordListAdapter(Context context,List<Message> messageList){
        mContext = context;
        mMessageList = messageList;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        if (mMessageList == null)   return 0;
        return mMessageList.size();
    }

    @Override
    public Object getItem(int i) {
        return mMessageList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = mInflater.inflate(R.layout.word_list_item,null,false);
        TextView tvKey = view.findViewById(R.id.tv_key);
        TextView tvMeans = view.findViewById(R.id.tv_means);
        Message message = mMessageList.get(i);
        tvKey.setText(message.getKey());
        List<Means> meansList = message.getMeans();
        StringBuilder builder = new StringBuilder();
        if (meansList.size() > 0){
            for (Means means : meansList) {
                String mean = means.getMeans().toString();
                builder.append(means.getPart()).append(mean.substring(1,mean.indexOf("]"))).append(" ");
            }
        }
        tvMeans.setText(builder.toString());


        return view;
    }


}
