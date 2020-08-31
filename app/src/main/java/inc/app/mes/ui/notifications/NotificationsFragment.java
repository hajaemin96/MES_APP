package inc.app.mes.ui.notifications;

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
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import inc.app.mes.R;
import inc.app.mes.recycler.ItemRecyclerVertical;
import inc.app.mes.recycler.RecyclerVerticalAdapter;

public class NotificationsFragment extends Fragment {

    private RecyclerView notificationRecycler;
    private RecyclerVerticalAdapter notificationAdapter;
    public ArrayList<String> title = new ArrayList<String>();
    public ArrayList<String> date = new ArrayList<String>();
    public static ArrayList<String> context = new ArrayList<String>();
    //    NotificationData notidata;
    public int itemSize;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        notificationRecycler = (RecyclerView)root.findViewById(R.id.NotificationRecycler);
//        notificationRecycler.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        notificationAdapter = new RecyclerVerticalAdapter();

        notificationRecycler.setLayoutManager(linearLayoutManager);

        ItemRecyclerVertical data1 = new ItemRecyclerVertical("title1", "date");
        notificationAdapter.addItem(data1);

        ItemRecyclerVertical data2 = new ItemRecyclerVertical("title2", "date");
        notificationAdapter.addItem(data2);

        ItemRecyclerVertical data3 = new ItemRecyclerVertical("title3", "date");
        notificationAdapter.addItem(data3);

        ItemRecyclerVertical data4 = new ItemRecyclerVertical("title4", "date");
        notificationAdapter.addItem(data4);

        ItemRecyclerVertical data5 = new ItemRecyclerVertical("title5", "date");
        notificationAdapter.addItem(data5);

        ItemRecyclerVertical data6 = new ItemRecyclerVertical("title6", "date");
        notificationAdapter.addItem(data6);

        ItemRecyclerVertical data7 = new ItemRecyclerVertical("title7", "date");
        notificationAdapter.addItem(data7);

        ItemRecyclerVertical data8 = new ItemRecyclerVertical("title8", "date");
        notificationAdapter.addItem(data8);

        ItemRecyclerVertical data9 = new ItemRecyclerVertical("title9", "date");
        notificationAdapter.addItem(data9);

        ItemRecyclerVertical data10 = new ItemRecyclerVertical("title10", "date");
        notificationAdapter.addItem(data10);

        ItemRecyclerVertical data11 = new ItemRecyclerVertical("title11", "date");
        notificationAdapter.addItem(data11);

        ItemRecyclerVertical data12 = new ItemRecyclerVertical("title12", "date");
        notificationAdapter.addItem(data12);

        notificationRecycler.setAdapter(notificationAdapter);

        return root;
    }
}