package com.juaracoding.mahasiswafield.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juaracoding.mahasiswafield.R;


public class AdapterListData extends RecyclerView.Adapter<AdapterListData.ViewHolder> {




    java.util.List<Geolocation> data;
    Context context;
    String lokasi;


    public AdapterListData(Context context, java.util.List<Geolocation> data){



        this.data = data;
        this.context = context;

    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data, parent, false);


        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        holder.txtNik.setText(data.get(position).getLatitude());
        holder.txtNama.setText(data.get(position).getLongitude());
        holder.txtAlamat.setText(data.get(position).getDatetime());

        holder.txtTanggal.setText(data.get(position).getDatetime());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    // Static inner class to initialize the views of rows
    static class ViewHolder extends RecyclerView.ViewHolder  {
        public TextView txtNik, txtNama, txtAlamat, txtTanggal;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);

            txtNik = (TextView) itemView.findViewById(R.id.txtNik);
            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
            txtAlamat = (TextView) itemView.findViewById(R.id.txtAlamat);

            txtTanggal = (TextView) itemView.findViewById(R.id.txtTanggal);


        }

    }


}
