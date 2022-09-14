package uz.exemple.less53_telegramui_contacts_java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import uz.exemple.less53_telegramui_contacts_java.R;
import uz.exemple.less53_telegramui_contacts_java.adapter.ChatAdapter;
import uz.exemple.less53_telegramui_contacts_java.model.Chat;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        BottomNavigationView navBar  = findViewById(R.id.bottom_navigation_view);
        BadgeDrawable badge1= navBar.getOrCreateBadge(R.id.actionChats);

        badge1.setVisible(true);
        badge1.setNumber(6);
        badge1.setBadgeTextColor(Color.WHITE);

        BadgeDrawable badge2 = navBar.getOrCreateBadge(R.id.settings);
        badge2.setVisible(true);
        badge2.setNumber(6);
        badge2.setBadgeTextColor(Color.WHITE);

        refreshAdapter(getAllChats());
    }
    void refreshAdapter(ArrayList<Chat> chats) {
        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<Chat> getAllChats(){
        ArrayList<Chat> chats  = new ArrayList<Chat>();

        chats.add(new Chat(R.drawable.ic_location_24, "Find People Nearby", "last sees recently"));
        chats.add(new Chat(R.drawable.ic_person_add_24, "Invite Friends", "last sees recently"));
        chats.add(new Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"));
        chats.add(new Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"));
        chats.add(new Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"));
        chats.add(new Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"));
        chats.add(new Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"));
        chats.add(new Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"));
        chats.add(new Chat(R.drawable.photo1, "Xushnud Boymurodov", "last sees recently"));
        chats.add(new Chat(R.drawable.photo3, "Kamolaxon Nematjonova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo2, "Barnoxon Kabirova", "last sees recently"));
        chats.add(new Chat(R.drawable.photo4, "Abdullatif Nematjonov", "last sees recently"));
        return chats;
    }
}