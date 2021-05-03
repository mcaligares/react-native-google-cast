package com.reactnative.googlecast;

import android.view.Menu;
import android.view.MenuItem;

import androidx.core.view.MenuItemCompat;
import androidx.mediarouter.app.MediaRouteActionProvider;

import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;

import com.reactnative.googlecast.R;

public class RNGCExpandedControllerActivity
  extends ExpandedControllerActivity {

  private static final int MENU_CAST = Menu.FIRST;

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);
    getMenuInflater().inflate(R.menu.expanded_controller, menu);
    CastButtonFactory.setUpMediaRouteButton(this, menu, R.id.media_route_menu_item);
    return true;
  }
}
