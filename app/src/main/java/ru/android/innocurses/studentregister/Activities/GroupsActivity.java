package ru.android.innocurses.studentregister.Activities;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import ru.android.innocurses.studentregister.Adapters.GroupListAdapter;
import ru.android.innocurses.studentregister.Managers.ManagerGroups;
import ru.android.innocurses.studentregister.Models.Group;
import ru.android.innocurses.studentregister.R;

public class GroupsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

    }


}
