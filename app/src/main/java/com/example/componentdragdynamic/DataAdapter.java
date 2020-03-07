package com.example.componentdragdynamic;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class DataAdapter extends RecyclerView.Adapter {

    private List<ComponentDragModel> modelData;
    Context context;

    public DataAdapter(List<ComponentDragModel> pModelData, Context contextParam) {
        this.modelData = pModelData;
        this.context = contextParam;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView layoutLabel;
        Button layoutBtn;
        ImageView image;
        TextView separator;

        public ViewHolder(ViewGroup itemView, Context context) {
            super(itemView);

            layoutLabel = new TextView(context);
            layoutBtn = new Button(context);
            image = new ImageView(context);
            separator = new TextView(context);

            layoutLabel.setLayoutParams(new ActionBar.LayoutParams(
                    ActionBar.LayoutParams.MATCH_PARENT,
                    ActionBar.LayoutParams.WRAP_CONTENT)
            );
            layoutLabel.setTextSize(40);
            layoutLabel.setTextColor(Color.parseColor("#FFFFFF"));
            layoutLabel.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


            ActionBar.LayoutParams paramsButton = new ActionBar.LayoutParams(
                    ActionBar.LayoutParams.WRAP_CONTENT,
                    ActionBar.LayoutParams.WRAP_CONTENT
            );
            paramsButton.topMargin = 320;
            paramsButton.leftMargin = 40;
            layoutBtn.setLayoutParams(paramsButton);
            layoutBtn.setBackgroundColor(Color.parseColor("#0F4B49"));
            layoutBtn.setTextColor(Color.parseColor("#FFFFFF"));


            ActionBar.LayoutParams paramsImage = new ActionBar.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            paramsImage.topMargin = 210;
            paramsImage.leftMargin = 350;
            paramsImage.bottomMargin = 20;
            image.setLayoutParams(paramsImage);

            separator.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,2));
            separator.setBackgroundColor(Color.parseColor("#FF008577"));

            itemView.addView(layoutLabel);
            itemView.addView(layoutBtn);
            itemView.addView(image);
            itemView.addView(separator);
        }

        public void binData(ComponentDragModel componentDragModel) {
            layoutLabel.setText(componentDragModel.getLayoutTitle());
            layoutBtn.setText(componentDragModel.getLayoutButton());
            image.setImageResource(componentDragModel.getLayoutImage());
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        ViewGroup view = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 560));
        relativeLayout.setBackgroundColor(Color.BLACK);

        ViewGroup view = relativeLayout;
        return new ViewHolder(view, context);
    }

//    @Override
//    public int getItemViewType(int position) {
//        return R.layout.activity_recycler_items;
//    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).binData(modelData.get(position));
    }

    @Override
    public int getItemCount() {
        return modelData.size();
    }
}

