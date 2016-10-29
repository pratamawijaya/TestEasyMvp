package com.pratamawijaya.cobaeasymvp;

import easymvp.AbstractPresenter;

/**
 * Created by Pratama Nur Wijaya
 * Date : Oct - 10/29/16
 * Project Name : CobaEasyMvp
 */

public class MainPresenter extends AbstractPresenter<MainView> {

  public MainPresenter() {
  }

  public void testClick() {
    getView().showMessage("hahaha");
  }
}
