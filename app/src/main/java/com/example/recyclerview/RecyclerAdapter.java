package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter< RecyclerAdapter.NumerosViewHolder>{
    private int numerosLista;

    public RecyclerAdapter(int numeros){
         numerosLista = numeros;
    }

    @NonNull
    @Override
    public NumerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       Context mContext = parent.getContext();
       int LayoutIdListaNumeros =R.layout.lista_numeros;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        boolean attachToParentRapido = false;
        View view = inflater.inflate(LayoutIdListaNumeros,parent, attachToParentRapido);

        NumerosViewHolder viewHolder = new NumerosViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumerosViewHolder holder, int position) {
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return numerosLista;
    }

    class NumerosViewHolder extends RecyclerView.ViewHolder{

        TextView mtListaNumerosView;
        public NumerosViewHolder(@NonNull View itemView) {
            super(itemView);

            mtListaNumerosView = itemView.findViewById(R.id.listaNumeros);

        }

        void bind (int listaIndex){

            mtListaNumerosView.setText(String.valueOf(listaIndex));
        }
    }


}
