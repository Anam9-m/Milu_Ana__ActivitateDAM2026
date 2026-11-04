package com.example.seminar4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MagazinAdapter extends BaseAdapter {

  private List<Magazin> magazine=null;
  private Context ctx;
  private int resursaLayout;

    public MagazinAdapter(List<Magazin> magazine, Context ctx, int resursaLayout) {
        this.magazine=magazine;
        this.ctx = ctx;
        this.resursaLayout = resursaLayout;
    }

    @Override
    public int getCount() {
        return magazine.size();
    }

    @Override
    public Object getItem(int position) {
        return magazine.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View v = inflater.inflate(resursaLayout, parent, false);
        TextView denumireTV=v.findViewById(R.id.denumireTV);
        TextView orasTV=v.findViewById(R.id.orasTV);
        TextView tipTV=v.findViewById(R.id.tipTV);
        TextView nrAngajatiTV=v.findViewById(R.id.nrAngajatiTV);

        return v;
    }
}
