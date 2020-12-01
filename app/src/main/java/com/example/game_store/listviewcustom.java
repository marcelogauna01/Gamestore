package com.example.game_store;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class listviewcustom extends ArrayAdapter<String> {

    private String[] gamename;
    private String[] descricao;
    private Integer[] imgid;
    private Activity context;
    public listviewcustom(Activity context, String[] gamename,String[] descricao,Integer[] imgid) {
        super(context, R.layout.listview,gamename);

        this.context=context;
            this.gamename=gamename;
            this.descricao=descricao;
            this.imgid=imgid;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View r=convertView;
      ViewHolder viewHolder=null;
      if(r==null)
      {
          LayoutInflater layoutInflater = context.getLayoutInflater();
          r=layoutInflater.inflate(R.layout.listview,null,true);
          viewHolder=new ViewHolder(r);
          r.setTag(viewHolder);
      }
      else{
          viewHolder= (ViewHolder) r.getTag();
      }viewHolder.ivw.setImageResource(imgid[position]);viewHolder.tvw1.setText(gamename[position]);viewHolder.tvw2.setText(descricao[position]);
        return r;
    }
    class ViewHolder{
       TextView tvw1;
       TextView tvw2;
       ImageView ivw;
      ViewHolder(View v)
      {
          tvw1=(TextView) v.findViewById(R.id.textoteste);
          tvw2=(TextView) v.findViewById(R.id.textoteste2);
          ivw=(ImageView) v.findViewById(R.id.imgteste);
      }
    }
}

