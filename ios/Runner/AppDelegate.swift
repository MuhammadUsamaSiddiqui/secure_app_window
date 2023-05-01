import UIKit
import Flutter

@UIApplicationMain
@objc class AppDelegate: FlutterAppDelegate {
  override func application(
    _ application: UIApplication,
    didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
  ) -> Bool {
    GeneratedPluginRegistrant.register(with: self)
    return super.application(application, didFinishLaunchingWithOptions: launchOptions)
  }

  // Hide your app's key window when your app will resign active.
  override func applicationWillResignActive(_ application: UIApplication) {
    self.window.isHidden = true;
  }
    
  // Show your app's key window when your app becomes active again.
  override func applicationDidBecomeActive(_ application: UIApplication) {
    self.window.isHidden = false;
  }
}