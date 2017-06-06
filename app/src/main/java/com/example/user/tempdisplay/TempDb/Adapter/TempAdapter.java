package com.example.user.tempdisplay.TempDb.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.tempdisplay.R;
import com.example.user.tempdisplay.TempDb.Model.TempDbCurrently;


public class TempAdapter extends RecyclerView.Adapter<TempAdapter.ViewHolder>
{
    private TempDbCurrently daiyTemp;
    private int rowLayout;
    private Context context;

    public TempAdapter(TempDbCurrently daiyTemp, int rowLayout, Context context)
    {
        this.daiyTemp = daiyTemp;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.textView.setText((int) daiyTemp.getTemperature());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;

        public ViewHolder(View itemView)
        {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.temp_new);
        }
    }
}
