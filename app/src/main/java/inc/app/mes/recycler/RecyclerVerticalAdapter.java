package inc.app.mes.recycler;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import inc.app.mes.R;

public class RecyclerVerticalAdapter extends RecyclerView.Adapter<RecyclerVerticalAdapter.ItemViewHolder> {

    private ArrayList<ItemRecyclerVertical> listData = new ArrayList<>();
    private ArrayList<String> context = new ArrayList<>();
    public RecyclerVerticalAdapter() {

    }
    class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView date;

        ItemViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            date = itemView.findViewById(R.id.date);

        }

//        void onBind(ItemRecyclerVertical data) {
//            date.setText(data.getTitle());
//            if (data.getTitle().length() > 15) {
//                String first = data.getTitle().substring(0, 15);
//                String second = data.getTitle().substring(15, data.getTitle().length());
//                data.setTitle(first + "\n" + second);
//            }
//            if (data.getDate() != "") {
//                data.setTitle(data.getTitle() + "\n" + data.getDate());
//            }
//            title.setText(data.getTitle());
//            date.setText(data.getDate());
//       }
    }

    public RecyclerVerticalAdapter(ArrayList<ItemRecyclerVertical> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemRecyclerVertical item = listData.get(position);

        holder.title.setText(item.getTitle());
        holder.date.setText(item.getDate());
        //holder.onBind(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void addItem(ItemRecyclerVertical ItemRecyclerVertical) {
        listData.add(ItemRecyclerVertical);
    }

}