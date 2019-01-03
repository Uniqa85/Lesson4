package lv.denisskaibagarovs.lesson4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewHolder {
    @BindView(R.id.imageView) public ImageView imageViewPhoto;
    @BindView(R.id.textViewAuthor) public TextView textViewAuthor;
    @BindView(R.id.textViewLocation) public TextView TextViewLocation;

    public ViewHolder(View view) {
        ButterKnife.bind(this, view);
    }

}
