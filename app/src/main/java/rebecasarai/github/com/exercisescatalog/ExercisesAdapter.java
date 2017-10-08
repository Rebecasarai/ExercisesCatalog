package rebecasarai.github.com.exercisescatalog;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Rebeca on 07/10/17.
 */
public class ExercisesAdapter extends RecyclerView.Adapter<ExercisesAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    private Context mContext;
    private List<Exercises> exercisesList;

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        public TextView title, count;
        public ImageView thumbnail, overflow;
        private final Context context;


        public MyViewHolder(View view) {
            super(view);
            context = itemView.getContext();
            inflater= LayoutInflater.from(context);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }


    public ExercisesAdapter(Context mContext, List<Exercises> exercisesList) {
        this.mContext = mContext;
        this.exercisesList = exercisesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.exercise_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Exercises exercises = exercisesList.get(position);
        holder.title.setText(exercises.getName());
        holder.count.setText(exercises.getDescrip());

        // loading exercises cover using Glide library
        Glide.with(mContext).load(exercises.getThumbnail()).into(holder.thumbnail);

        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });
    }

    /**
     * Muestra el menu popup cuando se da click en los 3 puntos
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_exercise, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener para el pop up de los items
     */
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Add to favourite", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return exercisesList.size();
    }
}
