package com.example.qube.gitworkflow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ander on 8/10/2016.
 */
public class ActorAdapter extends ArrayAdapter<Actor> {

    private int mLayoutResource;

    public ActorAdapter(Context context, int resource, List<Actor> objects) {
        super(context, resource, objects);
        this.mLayoutResource = resource;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(mLayoutResource, null);
        }

        Actor actor = getItem(position);

        if (actor != null) {
            TextView topTextView = (TextView) view.findViewById(R.id.tv_name);
            TextView middleTextView = (TextView) view.findViewById(R.id.tv_dob);
            TextView bottomTextView = (TextView) view.findViewById(R.id.tv_oscars_won);

            if (topTextView != null) {
                topTextView.setText(actor.getmTop());
            }

            if (middleTextView != null) {
                middleTextView.setText(actor.getmMiddle());
            }

            if (bottomTextView != null) {
                bottomTextView.setText(actor.getmBottom());
            }
        }

        return view;
    }
}
