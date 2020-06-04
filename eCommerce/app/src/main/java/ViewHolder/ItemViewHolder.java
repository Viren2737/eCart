package ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.R;

import Interface.ItemClickListener;


public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName,txtProductDescription,txtProductPrice,txtProductStatus;
    public ImageView imageView;
    public ItemClickListener listner;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.product_seller_image);
        txtProductName=(TextView)itemView.findViewById(R.id.product_seller_name);
        txtProductDescription=(TextView)itemView.findViewById(R.id.product_seller_description);
        txtProductPrice=(TextView)itemView.findViewById(R.id.product_seller_price);
        txtProductStatus=(TextView)itemView.findViewById(R.id.seller_product_state);

    }

    public void setItemClickListener(ItemClickListener listener){
        this.listner=listener;

    }

    @Override
    public void onClick(View v) {
        listner.onClick(v ,getAdapterPosition(),false);
    }
}

