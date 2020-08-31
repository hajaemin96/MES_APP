package inc.app.mes.ui.edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import inc.app.mes.R;
import inc.app.mes.recycler.ItemRecyclerVertical;
import inc.app.mes.recycler.RecyclerVerticalAdapter;

public class EditFragment extends Fragment {


    private RecyclerView editRecycler;
    private RecyclerVerticalAdapter editAdapter;
    public ArrayList<String> title = new ArrayList<String>();
    public ArrayList<String> date = new ArrayList<String>();
    public static ArrayList<String> context = new ArrayList<String>();
    public int itemSize;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_edit, container, false);

        editRecycler = (RecyclerView)root.findViewById(R.id.EditRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        editAdapter = new RecyclerVerticalAdapter();

        editRecycler.setLayoutManager(linearLayoutManager);

        ItemRecyclerVertical data1 = new ItemRecyclerVertical("title1", "date");
        editAdapter.addItem(data1);

        ItemRecyclerVertical data2 = new ItemRecyclerVertical("title2", "date");
        editAdapter.addItem(data2);

        ItemRecyclerVertical data3 = new ItemRecyclerVertical("title3", "date");
        editAdapter.addItem(data3);

        ItemRecyclerVertical data4 = new ItemRecyclerVertical("title4", "date");
        editAdapter.addItem(data4);

        ItemRecyclerVertical data5 = new ItemRecyclerVertical("title5", "date");
        editAdapter.addItem(data5);

        ItemRecyclerVertical data6 = new ItemRecyclerVertical("title6", "date");
        editAdapter.addItem(data6);

        ItemRecyclerVertical data7 = new ItemRecyclerVertical("title7", "date");
        editAdapter.addItem(data7);

        ItemRecyclerVertical data8 = new ItemRecyclerVertical("title8", "date");
        editAdapter.addItem(data8);

        ItemRecyclerVertical data9 = new ItemRecyclerVertical("title9", "date");
        editAdapter.addItem(data9);

        ItemRecyclerVertical data10 = new ItemRecyclerVertical("title10", "date");
        editAdapter.addItem(data10);

        ItemRecyclerVertical data11 = new ItemRecyclerVertical("title11", "date");
        editAdapter.addItem(data11);

        ItemRecyclerVertical data12 = new ItemRecyclerVertical("title12", "date");
        editAdapter.addItem(data12);

        editRecycler.setAdapter(editAdapter);

        return root;
    }
}