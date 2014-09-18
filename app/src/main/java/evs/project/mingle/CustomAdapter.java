package evs.project.mingle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iiitd on 19/9/14.
 */
public class CustomAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<CustomObject> objects;

    private class ViewHolder {
        TextView name;
        TextView text;
        TextView time;
    }

    public CustomAdapter(Context context, ArrayList<CustomObject> objects) {
        inflater = LayoutInflater.from(context);
        this.objects = objects;
    }

    public int getCount() {
        return objects.size();
    }

    public CustomObject getItem(int position) {
        return objects.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.single_home_list_item, null);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.text = (TextView) convertView.findViewById(R.id.text);
            holder.time = (TextView) convertView.findViewById(R.id.time);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.name.setText(objects.get(position).getName());
        holder.text.setText(objects.get(position).getText());
        holder.time.setText(objects.get(position).getTime());
        return convertView;
    }
}
