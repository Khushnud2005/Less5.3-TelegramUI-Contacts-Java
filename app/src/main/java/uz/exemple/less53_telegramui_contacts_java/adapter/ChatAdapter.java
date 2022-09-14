package uz.exemple.less53_telegramui_contacts_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

import uz.exemple.less53_telegramui_contacts_java.R;
import uz.exemple.less53_telegramui_contacts_java.model.Chat;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    Context context;
    ArrayList<Chat> items;

    public ChatAdapter(Context context, ArrayList<Chat> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chat chat = items.get(position);
        holder.iv_profile.setImageResource(chat.getProfile());
        holder.tv_fullname.setText(chat.getFullname());
        holder.tv_message.setText(chat.getMessage());
        if (position < 2){
            holder.tv_message.setVisibility(View.GONE);

        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ShapeableImageView iv_profile;
        TextView tv_fullname;
        TextView tv_message;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_profile = itemView.findViewById(R.id.iv_profile);
            tv_fullname = itemView.findViewById(R.id.tv_fullname);
            tv_message = itemView.findViewById(R.id.tv_message);
        }
    }
}
