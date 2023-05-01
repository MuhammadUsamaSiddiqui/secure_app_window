package com.example.secure_app_window

import android.os.Bundle
import android.view.WindowManager
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
  // override fun onCreate(savedInstanceState: android.os.Bundle?) {
  //  window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
  //  super.onCreate(savedInstanceState)
  // }

  override fun onPause() {
    window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
    super.onPause();
  }

  override fun onResume() {
    window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE)
    super.onResume();
  }
}