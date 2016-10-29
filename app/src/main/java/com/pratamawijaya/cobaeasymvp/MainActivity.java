package com.pratamawijaya.cobaeasymvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import easymvp.annotation.ActivityView;
import easymvp.annotation.Presenter;

@ActivityView(layout = R.layout.activity_main, presenter = MainPresenter.class)
public class MainActivity extends AppCompatActivity implements MainView {

  @Presenter MainPresenter presenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    presenter.testClick();
  }

  @Override protected void onStart() {
    super.onStart();
  }

  @Override protected void onStop() {
    super.onStop();
  }

  @Override public void showMessage(String msg) {
    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
  }
}
