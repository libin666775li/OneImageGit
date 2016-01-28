package com.example.lb.oneimagegit;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener {

    @Bind(R.id.listview)
    RecyclerView mListView;
    @Bind(R.id.swipyrefreshlayout)
    SwipeRefreshLayout swipyrefreshlayout;
    private int lastVisibleItem;
    MyAdapter myAdapter;
    private boolean refreshing = false;
    List list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        initLayout();
    }


    private void initLayout() {

        list = getDummyStrings();
        mListView = (RecyclerView) findViewById(R.id.listview);
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        mListView.setLayoutManager(lm);

        myAdapter = new MyAdapter(this, list);
        mListView.setAdapter(myAdapter);

        mListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE && lastVisibleItem + 1 == myAdapter.getItemCount()) {
                    refreshing = true;
                    swipyrefreshlayout.setRefreshing(true);

                    list.add("11111");
                    list.add("11111");
                    list.add("11111");
                    list.add("11111");


                    myAdapter.notifyDataSetChanged();
                    refreshing = false;
                    swipyrefreshlayout.setRefreshing(false);
                }


            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                lastVisibleItem = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            }
        });


    }

    public List<String> getDummyStrings() {
        List<String> dummyStrings = new ArrayList<>();

        dummyStrings.add("You want");
        dummyStrings.add("to test");
        dummyStrings.add("this library");
        dummyStrings.add("from both");
        dummyStrings.add("direction.");
        dummyStrings.add("You may");
        dummyStrings.add("be amazed");
        dummyStrings.add("when done");
        dummyStrings.add("so!");
        dummyStrings.add("I am");
        dummyStrings.add("going to");
        dummyStrings.add("add a little");
        dummyStrings.add("more lines");
        dummyStrings.add("for big");
        dummyStrings.add("smartphones.");

        return dummyStrings;
    }


    @Override
    public void onRefresh() {
        Toast.makeText(MainActivity.this, "下拉刷新", Toast.LENGTH_SHORT).show();
    }
}
