package com.studios.flytask;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Personal on 24.11.2017.
 */

public class OrderAdapter extends BaseAdapter {

    private final LayoutInflater mInflater;
    private ArrayList<OrderClass> list = new ArrayList<>();
    private Context context;

    public OrderAdapter(Context context, ArrayList<OrderClass> list) {
        this.context = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder = null;

        if (view == null) {
            view = mInflater.inflate(R.layout.order_item, null);
            viewHolder = new ViewHolder();
            viewHolder.mainLayout = view.findViewById(R.id.main_layout);
            viewHolder.orderDate = view.findViewById(R.id.order_date);
            viewHolder.orderNumber = view.findViewById(R.id.order_number);
            viewHolder.statusText = view.findViewById(R.id.status_text);
            viewHolder.statusImage = view.findViewById(R.id.status_image);
            viewHolder.nameTextOne = view.findViewById(R.id.name_text_one);
            viewHolder.nameTextTwo = view.findViewById(R.id.name_text_two);
            viewHolder.travelTextOne = view.findViewById(R.id.travel_text_one);
            viewHolder.travelTextTwo = view.findViewById(R.id.travel_text_two);
            viewHolder.iconText = view.findViewById(R.id.icon_text);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.nameTextOne.setText(list.get(i).getNameList().get(0));
        viewHolder.travelTextOne.setText(list.get(i).getTravelList().get(0));

        viewHolder.nameTextTwo.setText(list.get(i).getNameList().get(1));
        viewHolder.travelTextTwo.setText(list.get(i).getTravelList().get(1));

        viewHolder.orderNumber.setText(list.get(i).getOrderNumber());
        viewHolder.orderDate.setText(list.get(i).getOrderDate());

        if (i == 0) {
            viewHolder.iconText.setImageResource(R.drawable.ic_ticket);
        } else {
            if (i == 1) {
                viewHolder.iconText.setImageResource(R.drawable.ic_bag);
            } else {
                if (i == 2) {
                    viewHolder.iconText.setImageResource(R.drawable.ic_shield);
                }
            }
        }

        if (list.get(i).getOrderStatus().equals("1")) {
            viewHolder.statusText.setTextColor(context.getResources().getColor(R.color.done_color));
            viewHolder.statusText.setText("Оформлен");
            viewHolder.statusImage.setImageResource(R.drawable.done_asset);
        } else {
            if (list.get(i).getOrderStatus().equals("0")) {
                viewHolder.statusText.setTextColor(context.getResources().getColor(R.color.error_color));
                viewHolder.statusText.setText("Ошибка оформления");
                viewHolder.statusImage.setImageResource(R.drawable.error_asset);
            } else {
                viewHolder.statusText.setTextColor(context.getResources().getColor(R.color.colorPrimary));
                viewHolder.statusText.setText("Ожидается подтверждение");
                viewHolder.statusImage.setImageResource(R.drawable.waiting_asset);
            }
        }

        return view;
    }

    private class ViewHolder {
        LinearLayout mainLayout;
        TextView orderNumber;
        TextView orderDate;
        TextView statusText;
        ImageView statusImage;
        TextView nameTextOne;
        TextView travelTextOne;
        TextView nameTextTwo;
        TextView travelTextTwo;
        ImageView iconText;
    }

}
