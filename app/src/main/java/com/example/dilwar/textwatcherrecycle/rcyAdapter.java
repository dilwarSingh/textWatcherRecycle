package com.example.dilwar.textwatcherrecycle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.List;

/**
 * Created by dilwar on 09-05-2018.
 */

public class rcyAdapter extends RecyclerView.Adapter<rcyAdapter.viewHolder> {
    List<Names> list;

    public rcyAdapter(List<Names> list) {
        this.list = list;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {

        Names name = list.get(position);

        holder.editText.setText(name.getName());
        holder.checkBox.setChecked(name.getCheck());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {

        CheckBox checkBox;
        EditText editText;
        Button save;

        public viewHolder(View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkBox);
            editText = itemView.findViewById(R.id.editText);
            save = itemView.findViewById(R.id.save);

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int postion = getAdapterPosition();
                    String str = editText.getText().toString();

                    if (getODDorEVEN(postion) == NumberType.EVEN) {
                        for (int i = 0; i < list.size(); i += 2) {
                            list.get(i).setName(str);
                        }
                    } else {
                        for (int i = 1; i < list.size(); i += 2) {
                            list.get(i).setName(str);
                        }
                    }
                    notifyDataSetChanged();
                }
            });
        }

        private NumberType getODDorEVEN(int x) {
            return ((x & 1) == 0) ? NumberType.EVEN : NumberType.ODD;
        }
    }

    enum NumberType {ODD, EVEN}
}


