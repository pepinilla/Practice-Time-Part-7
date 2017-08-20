package com.example.carolina.practicetime.TerceraActividad;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.carolina.practicetime.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.support.design.R.styleable.View;

/**
 * Created by carolina on 24/07/17.
 */

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    public List<DataHelper3> getList() {
        return list;
    }

    private List<DataHelper3> list;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public RecyclerViewAdapter(List<DataHelper3> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemview = inflater.inflate(R.layout.item_first_fragment, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemview);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DataHelper3 dataHelper3 = list.get(position);
        holder.text2.setText(dataHelper3.toString());
        if (this.onItemClickListener == null){
            holder.setOnItemClickListener(dataHelper3, this.onItemClickListener);
        }

    }

    @Override
    public int getItemCount() {
        return getList().size();
    }

    public void addToList(DataHelper3 dataHelper3){
        getList().add(dataHelper3);
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.text2)
        TextView text2;
        private View view;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }

        public void setOnItemClickListener (final DataHelper3 dataHelper3, final OnItemClickListener onItemClickListener){
            view.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    onItemClickListener.CliclListener(dataHelper3);
                }
            });
        }
    }



}
