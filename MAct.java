package com.ayan.hax;

//import static top.niunaijun.blackbox.core.env.BEnvironment.getDataFilesDir;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import android.widget.Button;
import android.view.View.OnClickListener;
import androidx.core.app.ActivityCompat;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import android.content.DialogInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.os.Environment;
import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import androidx.core.content.ContextCompat;
import android.os.Handler;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.system.pm.BPackage;
import top.niunaijun.blackbox.entity.pm.InstallResult;
import top.niunaijun.blackbox.core.GmsCore;
import top.niunaijun.blackbox.utils.FileUtils;
import org.lsposed.lsparanoid.Obfuscate;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
//import android.support.design.widget.BottomNavigationView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import android.view.Gravity; // Make sure to import Gravity
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.widget.Button;
import android.widget.TextView;
//import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import com.ayan.hax.drawing.FourService;
import com.ayan.hax.drawing.Overlay;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.ayan.hax.utils.Tmes;
import com.ayan.hax.utils.myTools;
import java.util.ArrayList;
import java.util.List;
import android.widget.*;
import android.widget.CompoundButton.*;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.content.DialogInterface;
import java.net.URL;
import java.net.URLConnection;
//import java.nio.file.Files;
import org.json.JSONException;
import org.json.JSONObject;
import android.os.Looper;
import android.app.ProgressDialog;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
//import android.app.AlertDialog;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import android.os.Build;
import android.view.WindowManager;
import java.util.HashSet;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.util.Log;
import android.widget.Toast;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import java.lang.reflect.Method;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Obfuscate

public class MAct extends AppCompatActivity {

    Context ctx;
    InstallResult installResult;
    BlackBoxCore blackboxCore;

    int Storage_Permission = 142;
    
    // Update Check
    
    

    String Launch = "Launch";
    String[] appPackage = {"com.tencent.ig","com.pubg.krmobile","com.pubg.imobile","com.twitter.android","com.facebook.katana","com.vng.pubgmobile","com.rekoo.pubgm","com.android.vending","telegram @ayansy3d"};
    String[] fbPackage = {
        "com.facebook.katana",
        "com.webview.space",
        "com.facebook.services",
        "com.facebook.system",
        "telegram @ayansy3d"
    };

    static {
        System.loadLibrary("ayan");
    }

    MaterialButton installtwitter,installfacebook;

    
    private native String Tele();
  //  private ActivityMonitor activityMonitor; //load lib monitor
    

    
    public static String socket;
    public String daemonPath,libPath;
    public String verPath;
	public ImageView mbutton1,mbutton2;
	public static int game_ver = 0;
  /*  public native String Dexter();
    String dexdownload = Dexter();*/
    private static final int PICK_APK_REQUEST = 1001;
    public static boolean Record = false;


	 public static boolean isBgmi = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        blackboxCore = BlackBoxCore.get();
        blackboxCore.doCreate();
        BlackBoxCore.get().installGms(0);
     PackageManager pm = getPackageManager();
String packageName = getPackageName(); 



        ctx = this;
    //   PermissionStirage();
     //   new Downtwo(this).execute("1",dexdownload);
        Makedir();
        
        ExecuteElf("su -c");
       Execute("/ccc");
      // loadAssets64();
		loadMain();
        
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        // load lib
      /*  activityMonitor = new ActivityMonitor(this);
        activityMonitor.startMonitoring();
    */
   


            
        
      //  showTypewriterDialog();
           
      /*  AlertDialog.Builder builder = new AlertDialog.Builder(MAct.this);
		builder.setTitle("How To Use;-");
		builder.setMessage("ᴿᵒᵒᵗ ᵁˢᵉʳˢ ᶜᵃⁿ ˢᵗᵃʳᵗ ᵁˢⁱⁿᵍ ᴾˡᵃʸ ᴮᵘᵗᵗᵒⁿ\nᴺᵒ ᴺᵉᵉᵈ ᵗᵒ ᴵⁿˢᵗᵃˡˡ ᴳᵃᵐᵉˢ\n\nᴺᵒⁿʳᵒᵒᵗ\nˢᵒᵐᵉ ᵈᵉᵛⁱᶜᵉˢ ᴺᵉᵉᵈ ᴹᵃⁿᵘᵃˡ ᵍⁱᵛᵉ ᴾᵉʳᵐⁱˢˢⁱᵒⁿˢ ᶠᵒʳ ᶜᵒᵖʸ ᵒᵇᵇ\nᶠᵒʳ ᴾʳᵒ ᵁˢᵉʳˢ ᴰᵃᵗᵃ ᴰⁱʳ ᴵˢ ˢᵈᶜᵃʳᵈ⁻ᵇˡᵃᶜᵏᵇᵒˣ");
		builder.setCancelable(false);
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialogInterface, int i) {
					//System.exit(0);
				}
			});
		builder.show();*/


AlertDialog.Builder builder = new AlertDialog.Builder(MAct.this);
AlertDialog dialog = builder.create();
dialog.setTitle("Fix issues;-");
dialog.setMessage("1st time open may it stuck but 2nd time ok\nIf stuck or crash still use crashfix activate 2nd logo twice\nIf Use Old Twiter apk\n Email Linking\nClick Right UpCroner ⋮ And Install GoogleSupport\nAlso Obb Fix Option There\n\nRoot Users No Need To Install Apps\nJust Click Play Button\nFor Piro Users Or Obb & Data Manual Copy Dir Is\nSdcard/blackbox\n");
dialog.setCancelable(false);
dialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        // Do something on OK click
    }
});



// Show dialog first
dialog.show();

// Change background color to black
dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.BLACK));

// Get TextViews inside the dialog and change text color
TextView title = dialog.findViewById(android.R.id.title);
TextView message = dialog.findViewById(android.R.id.message);
Button positiveButton = dialog.getButton(DialogInterface.BUTTON_POSITIVE);

// Set text color to white
if (title != null) title.setTextColor(Color.WHITE);
if (message != null) message.setTextColor(Color.WHITE);
if (positiveButton != null) positiveButton.setTextColor(Color.WHITE);




        MaterialToolbar materialToolbar = findViewById(R.id.toolbar);
        materialToolbar.inflateMenu(R.menu.options_home);

        if (!Settings.canDrawOverlays(this)) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
            startActivity(intent);
        }

        MaterialButton InstallGlobal = findViewById(R.id.InstallGlobal);
        MaterialButton installkorea = findViewById(R.id.installkorea);
        MaterialButton installbgmi = findViewById(R.id.InstallBgmi);
        MaterialButton installvng = findViewById(R.id.installvng);
       MaterialButton installtw = findViewById(R.id.installtw);
        MaterialButton installvia = findViewById(R.id.installvia);
        installtwitter = findViewById(R.id.installtwitter);
        installfacebook = findViewById(R.id.installfacebook);
      //  MaterialButton installgg = findViewById(R.id.installgg);
      /*  MaterialButton fixinstall = findViewById(R.id.fixinstall);
       if (Build.VERSION.SDK_INT <= 29) {  // Android 10 (API 29) or below
    fixinstall.setVisibility(View.GONE);
}*/

    MaterialButton libBindButton = findViewById(R.id.libbind);
        libBindButton.setOnClickListener(v -> {
            Intent chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
            chooseFile.setType("*/*");
            chooseFile.putExtra(Intent.EXTRA_MIME_TYPES, new String[]{"application/octet-stream"});
            chooseFile = Intent.createChooser(chooseFile, "Choose a .so file");
            startActivityForResult(chooseFile, 1);
        });
    
        
        mbutton1=(ImageView)findViewById(R.id.b01);
        mbutton2=(ImageView)findViewById(R.id.b02);

        

        InstallGlobal.setOnClickListener(view -> {
            InstallGame(InstallGlobal,appPackage[0]);
        });

        installkorea.setOnClickListener(view -> {
            InstallGame(installkorea,appPackage[1]);
        });

        installbgmi.setOnClickListener(view -> {
            InstallGame(installbgmi,appPackage[2]);
        });
        
        installvng.setOnClickListener(view -> {
            InstallGame(installvng,appPackage[5]);
        });

       installtw.setOnClickListener(view -> {
            InstallGame(installtw,appPackage[6]);
        });
        installfacebook.setOnClickListener(view -> {
                 if (LogAct.Container == true) {
            if(isPackageInstalled(fbPackage[0])){
                blackboxCore.launchApk(fbPackage[0],0);
            }  else {
                installResult = blackboxCore.installPackageAsUser(fbPackage[0],0);
                if (installResult.success) {
                    installfacebook.setText(Launch);
                } else {
                    Toast.makeText(ctx, installResult.msg, Toast.LENGTH_SHORT).show();
                }
            }
                    }
        });
        
        
        



         /* if(isPackageInstalled(fbPackage[0])){
                blackboxCore.launchApk(fbPackage[0],0);
           }  else {
                installResult = blackboxCore.installPackageAsUser(fbPackage[0],0);
                        installResult = blackboxCore.installPackageAsUser(fbPackage[1],0);
                       installResult = blackboxCore.installPackageAsUser(fbPackage[2],0);
                      installResult = blackboxCore.installPackageAsUser(fbPackage[3],0);
                if (installResult.success) {
                    installfacebook.setText(Launch);
                } else {
                    Toast.makeText(ctx, installResult.msg, Toast.LENGTH_SHORT).show();
                }
            }
                    }
        });*/

        /*
        
          if (FCore.get().installPackageAsUser(new File(this.this$1.this$0.getActivity().getFilesDir().getPath() + "/Via.apk"), 0).getSuccess()) {
       File viaPath = new File(getFilesDir().getPath() + "/Via.apk"), 0);
        */
        
        installtwitter.setOnClickListener(view -> {
               if (LogAct.Container == true) {
            if(isPackageInstalled(appPackage[3])){
                blackboxCore.launchApk(appPackage[3],0);
            }  else {
                installResult = blackboxCore.installPackageAsUser(appPackage[3],0);
                if (installResult.success) {
                    installtwitter.setText(Launch);
                } else {
                    Toast.makeText(ctx, installResult.msg, Toast.LENGTH_SHORT).show();
                }
            }
                    }
        });
        
       /* installvia.setOnClickListener(view -> {
               if (LogAct.Container == true) {
          if(isPackageInstalled(appPackage[7])){
                blackboxCore.launchApk(appPackage[7],0);
            }  else {
                installResult = blackboxCore.installPackageAsUser(appPackage[7],0);
                if (installResult.success) {
                    installvia.setText(Launch);
                } else {
                    Toast.makeText(ctx, installResult.msg, Toast.LENGTH_SHORT).show();
                }
            }
                    }
        });*/
        
     /*  installvia.setOnClickListener(view -> {
               if (LogAct.Container == true) {
           if(isPackageInstalled(appPackage[7])){
                blackboxCore.launchApk(appPackage[7],0);
            }  else {
                  File viaPath = new File(getFilesDir().getPath() + "/via.apk");      
                installResult = blackboxCore.installPackageAsUser(viaPath,0);
                if (installResult.success) {
                    installvia.setText(Launch);
                } else {
                    Toast.makeText(ctx, installResult.msg, Toast.LENGTH_SHORT).show();
                }
            }
                    }
        });
        */
       
       installvia.setOnClickListener(view -> {
    if (LogAct.Container) {
       showAppPickerDialog();
    }
});

     /*   installgg.setOnClickListener(view -> {
           startFloater();
        });
        */
        mbutton1.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View p1) {         
                   // File fool = new File(verPath);
                	//  if(fool.exists()){
                     /*else{
                        Toast.makeText(getApplicationContext(),"version cracked!!", Toast.LENGTH_LONG).show();
                    }*/
                    
                    if (LogAct.Container == false) {
                      
                    mbutton1.setVisibility(View.GONE);
                    mbutton2.setVisibility(View.VISIBLE);
                    startFloater();
                    }
                   
                 }

               // }
            });

		// Button mbutton2 = findViewById(R.id.b02);
        mbutton2.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View p1) {         
                    mbutton2.setVisibility(View.GONE);
					mbutton1.setVisibility(View.VISIBLE);
                    stopFloating();

                }
            });

        
      /*  fixinstall.setOnClickListener(view -> {
                
					FixObb(installfacebook,appPackage[0]);
				
        });*/

       if (isPackageInstalled(appPackage[0])) {
            InstallGlobal.setText(Launch);
            game_ver =0;
            
        }

        if (isPackageInstalled(appPackage[1])) {
            installkorea.setText(Launch);
            game_ver =1;
            
        }

        if (isPackageInstalled(appPackage[2])) {
            installbgmi.setText(Launch);
           game_ver =2;
            isBgmi = true;
            
        }

        if (isPackageInstalled(appPackage[3])) {
            installtwitter.setText(Launch);
        }

        if (isPackageInstalled(appPackage[4])) {
            installfacebook.setText(Launch);
        }
        if (isPackageInstalled(appPackage[5])) {
            installvng.setText(Launch);
           game_ver =3;
            
        }
       if (isPackageInstalled(appPackage[6])) {
            installtw.setText(Launch);
           game_ver =4;
            
        }

      /*  if (isPackageInstalled(appPackage[5])){
            installgg.setText(Launch);
            blackboxCore.launchApk(appPackage[5],0);
        } else {
            installResult = blackboxCore.installPackageAsUser(appPackage[5],0);
            if (installResult.success) {
                installgg.setText(Launch);
                blackboxCore.launchApk(appPackage[5],0);
            } else {
                Toast.makeText(ctx, installResult.msg, Toast.LENGTH_SHORT).show();
            }*/
      //  }

        version(findViewById(R.id.vrglobal));
        version(findViewById(R.id.vrkorea));
        version(findViewById(R.id.vrvng));
       version(findViewById(R.id.vrtw));
        version(findViewById(R.id.vrindia));

      /*  LinearLayout imageView = findViewById(R.id.telegram);
        imageView.setOnClickListener(view -> {
            GoToTelegram();
        });
*/
    }

    @Override
public boolean onMenuOpened(int featureId, Menu menu) {
    if (menu != null && "MenuBuilder".equals(menu.getClass().getSimpleName())) {
        try {
            Method method = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", boolean.class);
            method.setAccessible(true);
            method.invoke(menu, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return super.onMenuOpened(featureId, menu);
}

    
    @Override
public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main_menu, menu);
    return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.install_gms:
            BlackBoxCore.get().installGms(0);
            Toast.makeText(this, "Installed pleaae restart App Now..", Toast.LENGTH_SHORT).show();

            new Thread(() -> {
                File viaPath = new File(getFilesDir(), "via.apk");
                if (!viaPath.exists()) {
                    runOnUiThread(() -> Toast.makeText(this, " not found!", Toast.LENGTH_SHORT).show());
                    return;
                }

                InstallResult installResult = BlackBoxCore.get().installPackageAsUser(viaPath, 0);
                runOnUiThread(() -> {
                    if (installResult.success) {
                        Toast.makeText(this, "Google installed successfully!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Failed to install Google!", Toast.LENGTH_SHORT).show();
                    }
                });
            }).start();
            return true;

        case R.id.uninstall_gms: 
    BlackBoxCore.get().uninstallGms(0);
    Toast.makeText(this, "Uninstalling GMS...", Toast.LENGTH_SHORT).show();
    return true;

case R.id.fixinstall:
    View anchorView = findViewById(android.R.id.content); // root layout
    showFixObbMenu(anchorView);
    return true;

// Your new toggle case
case R.id.toggle_recording:
    Record = !Record; // Toggle the boolean

    MenuItem toggleItem = item; // This is the clicked menu item

    if (Record) {
        toggleItem.setTitle("Hide-Recording Enabled");
                Record = true;
        //toggleItem.setIcon(R.drawable.ic_record_on);
        Toast.makeText(this, "Recording Enabled", Toast.LENGTH_SHORT).show();
    } else {
        toggleItem.setTitle("Hide-Recording Disabled");
                Record = false;
      //  toggleItem.setIcon(R.drawable.ic_record_off);
        Toast.makeText(this, "Recording Disabled", Toast.LENGTH_SHORT).show();
    }

    return true;

default:
    return super.onOptionsItemSelected(item);

    }
}


void showFixObbMenu(View anchorView) {
    // Create a list of items (you can update this array based on the available packages)
    final CharSequence[] items = {"Global", "Korea", "VNG", "Taiwan", "BGMI"};
    final int[] icons = {
        R.drawable.ic_global,  // Global
        R.drawable.ic_korea,   // Korea
        R.drawable.ic_vng,     // VNG
        R.drawable.ic_taiwan,  // Taiwan
        R.drawable.ic_bgmi     // BGMI
    };

    // Create an AlertDialog
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("Select Obb Fix Option");

    // Use a custom adapter to set both text and icons
    builder.setAdapter(new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1, items) {
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Inflate the custom layout
            View view = LayoutInflater.from(getContext()).inflate(R.layout.custom_dialog_item, parent, false);

            // Set the text for the item
            TextView textView = view.findViewById(R.id.item_text);
            textView.setText(items[position]);

            // Set the icon for the item
            ImageView iconView = view.findViewById(R.id.item_icon);
            iconView.setImageResource(icons[position]);

            return view;
        }
    }, (dialog, which) -> {
        // Handle the selection of the menu item
        String pkg = "";
        String vcode = "19725";  // Default version code for all games

        switch (which) {
            case 0:  // Global
                pkg = "com.tencent.ig";  // Global package
                break;
            case 1:  // Korea
                pkg = "com.pubg.krmobile";  // Korea package
                break;
            case 2:  // VNG
                pkg = "com.vng.pubgmobile";  // VNG package
                break;
            case 3:  // Taiwan
                pkg = "com.rekoo.pubgm";  // Taiwan package
                break;
            case 4:  // BGMI
                pkg = "com.pubg.imobile";  // BGMI package
                vcode = "19725";  // Different version code for BGMI
                break;
        }

        // Show a toast with the selected package
        if (LogAct.Container == true) {
            if (new File("/storage/emulated/0/blackbox/Android/obb/"+pkg+"/main."+vcode+"."+pkg+".obb").exists()) {
                Toast.makeText(getApplicationContext(), "OBB Installed", Toast.LENGTH_LONG).show();
            } else {
                new MyCopyTask().execute("/storage/emulated/0/Android/obb/"+pkg+"/main."+vcode+"."+pkg+".obb", pkg);
            }
        }
    });

    // Show the dialog
    builder.create().show();
}

                

private class MyCopyTask extends AsyncTask<String, Integer, File> {
    AlertDialog dialog;
    ProgressBar progressBar;
    TextView progressText;
    String message;

    @Override
    protected void onPreExecute() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ctx, R.style.WrapContentDialog);
        builder.setCancelable(false);

        // Inflate custom layout
        View customLayout = getLayoutInflater().inflate(R.layout.dialog_game_blaster_progress, null);
        progressBar = customLayout.findViewById(R.id.progressBar);
        progressText = customLayout.findViewById(R.id.progressText);

        builder.setView(customLayout);
        dialog = builder.create();
        dialog.show();
    }

    @Override
    protected File doInBackground(String... params) {
        String sourcePath = params[0];
        File source = new File(sourcePath);
        String filename = sourcePath.substring(sourcePath.lastIndexOf("/") + 1);
        File destination = new File("/storage/emulated/0/blackbox/Android/obb/" + params[1] + "/" + filename);

        try {
            long totalBytes = source.length();
            long copiedBytes = 0;
            byte[] buffer = new byte[4096];
            int bytesRead;

            FileInputStream inStream = new FileInputStream(source);
            FileOutputStream outStream = new FileOutputStream(destination);

            while ((bytesRead = inStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
                copiedBytes += bytesRead;
                int progress = (int) ((copiedBytes * 100) / totalBytes);
                publishProgress(progress);
            }

            inStream.close();
            outStream.close();
        } catch (IOException e) {
            message = e.getMessage();
        }

        return destination;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        int progress = values[0];
        progressBar.setProgress(progress);
        progressText.setText(progress + "%");
    }

    @Override
    protected void onPostExecute(File result) {
        dialog.dismiss();
        // Handle the result as needed
    }
}







   
    private void showAppPickerDialog() {
        List<ApplicationInfo> virtualApps = blackboxCore.getInstalledApplications(0, 0);
        List<ApplicationInfo> allApps = getPackageManager().getInstalledApplications(0);

        List<String> appNames = new ArrayList<>();
        List<String> packageNames = new ArrayList<>();

        for (ApplicationInfo app : virtualApps) {
            appNames.add("Installed ✓ " + app.loadLabel(getPackageManager()).toString());
            packageNames.add(app.packageName);
        }

        for (ApplicationInfo app : allApps) {
            if ((app.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                appNames.add("＋ " + app.loadLabel(getPackageManager()).toString());
                packageNames.add(app.packageName);
            }
        }

        appNames.add("📂 Pick APK from Storage...");
        packageNames.add(null);

        if (appNames.isEmpty()) {
            Toast.makeText(this, "No apps found", Toast.LENGTH_SHORT).show();
            return;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, appNames);
        new AlertDialog.Builder(this)
            .setTitle("Select an App or APK File")
            .setAdapter(adapter, (dialog, which) -> {
                String selectedPackage = packageNames.get(which);
                if (selectedPackage == null) {
                    pickApkFromStorage();
                } else {
                    showAppOptionsDialog(selectedPackage);
                }
            })
            .setNegativeButton("Cancel", null)
            .show();
    }

    private void showAppOptionsDialog(String packageName) {
        new AlertDialog.Builder(this)
            .setTitle("Choose Action")
            .setItems(new String[]{"Launch", "Uninstall", "Install in Virtual"}, (dialog, which) -> {
                switch (which) {
                    case 0:
                        launchApp(packageName);
                        break;
                    case 1:
                        uninstallApp(packageName);
                        break;
                    case 2:
                        installSelectedApp(packageName);
                        break;
                }
            })
            .setNegativeButton("Cancel", null)
            .show();
    }

    private void launchApp(String packageName) {
        if (blackboxCore.isInstalled(packageName, 0)) {
            blackboxCore.launchApk(packageName, 0);
        } else {
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntent != null) {
                startActivity(launchIntent);
            } else {
                Toast.makeText(this, "Cannot launch app", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void uninstallApp(String packageName) {
        if (blackboxCore.isInstalled(packageName, 0)) {
            blackboxCore.uninstallPackageAsUser(packageName, 0);
            Toast.makeText(this, "Uninstalled from Virtual", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(Intent.ACTION_DELETE);
            intent.setData(Uri.parse("package:" + packageName));
            startActivity(intent);
        }
    }

    private void installSelectedApp(String packageName) {
        String apkPath = getApkPathFromPackage(packageName);
        if (apkPath != null) {
            File apkFile = new File(apkPath);
            InstallResult installResult = blackboxCore.installPackageAsUser(apkFile, 0);
            if (installResult.success) {
                Toast.makeText(this, "App Installed in Virtual Space!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, installResult.msg, Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Failed to get APK path", Toast.LENGTH_SHORT).show();
        }
    }

    private String getApkPathFromPackage(String packageName) {
        try {
            ApplicationInfo appInfo = getPackageManager().getApplicationInfo(packageName, 0);
            return appInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void pickApkFromStorage() {
    Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
    intent.setType("application/vnd.android.package-archive");
    intent.addCategory(Intent.CATEGORY_OPENABLE);
    startActivityForResult(Intent.createChooser(intent, "Select APK"), PICK_APK_REQUEST);
}

    // ✅ FIX: Merge this into your existing `onActivityResult()`
  @Override
protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    
    if (requestCode == PICK_APK_REQUEST && resultCode == RESULT_OK && data != null) {
        Uri apkUri = data.getData();
        if (apkUri != null) {
            installApkFromUri(apkUri);
        }
    }
   }

    private void installApkFromUri(Uri apkUri) {
        File apkFile = new File(getRealPathFromUri(apkUri));
        if (apkFile.exists()) {
            InstallResult installResult = blackboxCore.installPackageAsUser(apkFile, 0);
            if (installResult.success) {
                Toast.makeText(this, "APK Installed Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, installResult.msg, Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Invalid APK File", Toast.LENGTH_SHORT).show();
        }
    }

    private String getRealPathFromUri(Uri uri) {
        String filePath = null;
        try {
            Cursor cursor = getContentResolver().query(uri, null, null, null, null);
            if (cursor != null) {
                int nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                cursor.moveToFirst();
                String fileName = cursor.getString(nameIndex);
                cursor.close();

                File file = new File(getCacheDir(), fileName);
                InputStream inputStream = getContentResolver().openInputStream(uri);
                FileOutputStream outputStream = new FileOutputStream(file);
                byte[] buffer = new byte[1024];
                int read;
                while ((read = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, read);
                }
                inputStream.close();
                outputStream.close();

                filePath = file.getAbsolutePath();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePath;
    }



    
    void version(TextView textView){
        textView.setText(textView.getText().toString().replaceAll("3.7.0","3.7.1"));
    }
    

           private void ExecuteElf(java.lang.String p0) {
	}
    
    // play button remove for nonroot
  /*  private void HidePlay(){
        if (LogAct.Container == true) {
            
        mbutton1.setVisibility(View.GONE);
        mbutton2.setVisibility(View.GONE);
     }
    }*/
    private void GoToTelegram() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(Tele()));
        startActivity(browserIntent);
    }
    // floatijg start stop
    private void startFloater() {
        startService(new Intent ( getApplicationContext(), FourService.class));
        loadAssets();
        }
    
    private void stopFloating() {
        stopService(new Intent(this, Overlay.class));
        stopService(new Intent(this, FourService.class));
      //  Execute("/off.sh");
	}
    
    
   void InstallGame(MaterialButton materialButton,String GameName) {
          if (LogAct.Container == true) {
            
        if (getPackageManager().canRequestPackageInstalls()){
          
                if(isPackageInstalled(GameName)){
                    blackboxCore.launchApk(GameName,0);
                    startFloater();
                } else {
                    installResult = blackboxCore.installPackageAsUser(GameName,0);
                    if (installResult.success) {
                        materialButton.setText(Launch);
                    } else {
                        Toast.makeText(this, installResult.msg, Toast.LENGTH_SHORT).show();
                    }
                }
         
        } else {
            startActivityForResult(new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES),112);
        }
    }
 }

    
    
    
           
    boolean isPackageInstalled(String appPackage){
        return blackboxCore.isInstalled(appPackage,0);
    }
    
    
    

    
    public void loadAssets() {
		String filepath =Environment.getExternalStorageDirectory() + "/Android/data/.tyb";
        FileOutputStream fos = null;
        try {
			fos = new FileOutputStream(filepath);
			byte[] buffer = "DO NOT DELETE".getBytes();
			fos.write(buffer, 0, buffer.length);
			fos.close();
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		daemonPath =getFilesDir().toString() +"/sock64";
     //  libPath =getFilesDir().toString() +"/vayan";
		if (LogAct.isRootGiven()) {
			socket = "su -c " + daemonPath;
		} else {
			socket = daemonPath;
		}
		try {
			Runtime.getRuntime().exec("chmod 777 " + daemonPath);
			//Runtime.getRuntime().exec("chmod 777 " + libPath);
		} catch (IOException e) {
		}
	}
	
	private void ExecuteElf() {
        try {
            Runtime.getRuntime().exec("su -c", null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
        
    
	private void loadMain() {
        MoveAssets(getFilesDir() + "/", "libpubgm.so");
        MoveAssets(getFilesDir() + "/", "libbgmi.so");
        MoveAssets(getFilesDir() + "/", "libSdk.so");
        MoveAssets(getFilesDir() + "/", "socu64");
        MoveAssets(getFilesDir() + "/", "ayan");  
		MoveAssets(getFilesDir() + "/", "via.apk");  
		MoveAssets(getFilesDir() + "/", "ccc");  
		MoveAssets(getFilesDir() + "/", "bootloop");  
		MoveAssets(getFilesDir() + "/", "rayan");  
    }


	

    
    public void Execute(String path) {
        try {
            ExecuteElf("chmod 777 " + getFilesDir() + path);//VIRTUAL
            ExecuteElf(getFilesDir() + path);
            ExecuteElf("su -c chmod 777 " + getFilesDir() + path);//ROOT
            ExecuteElf("su -c " + getFilesDir() + path);
        } catch (Exception e) {
        }
    }

    
    private boolean MoveAssets(String outPath, String fileName) {
        File file = new File(outPath);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Log.e("--Method--", "copyAssetsSingleFile: cannot create directory.");
                return false;
            }
        }
        try {
            InputStream inputStream = getAssets().open(fileName);
            File outFile = new File(file, fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(outFile);
            byte[] buffer = new byte[1024];
            int byteRead;
            while (-1 != (byteRead = inputStream.read(buffer))) {
                fileOutputStream.write(buffer, 0, byteRead);
            }
            inputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
	}
    
  void Makedir() {
        if (LogAct.Container == true) {
       File GlobalFolder = new File("/storage/emulated/0/blackbox/Android/obb/com.tencent.ig/");
        File KoreaFolder = new File("/storage/emulated/0/blackbox/Android/obb/com.pubg.krmobile/");
        File BgmiFolder = new File("/storage/emulated/0/blackbox/Android/obb/com.pubg.imobile/");
		if(GlobalFolder.exists()){

			//new DownloadFileFromURL().execute(file_url2);
		}
		else if(!GlobalFolder.exists()){
           GlobalFolder.mkdirs();
            KoreaFolder.mkdirs();
            BgmiFolder.mkdirs();
            }
        }
   }
    
    
    


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Storage_Permission) {
            if (!hasAllPermissionsGranted(grantResults)) {
                Toast.makeText(this, "Unable To Get Storage Permission", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public boolean hasAllPermissionsGranted(@NonNull int[] grantResults) {
        for (int grantResult : grantResults) {
            if (grantResult == PackageManager.PERMISSION_DENIED) {
                return false;
            }
        }
        return true;
    }

    void RunShell(String cmd){
        try {
            Runtime.getRuntime().exec(new String[]{"sh","-c",cmd});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    


    
      /*  @Override
public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if (requestCode != 1 || resultCode != Activity.RESULT_OK || data == null || data.getData() == null) {
        Toast.makeText(this, "File selection failed", Toast.LENGTH_SHORT).show();
        return;
    }

    Uri fileUri = data.getData();
    if (fileUri == null) {
        Toast.makeText(this, "Invalid file selection", Toast.LENGTH_SHORT).show();
        return;
    }

    // Check if the selected file is a .so file
    String fileName = getFileName(fileUri);
    if (!fileName.endsWith(".so")) {
        Toast.makeText(this, "Please select a valid .so file", Toast.LENGTH_SHORT).show();
        return;
    }

    // Copy the selected file to app's private directory
    File destFile = new File(getFilesDir(), "safecheat.so");

    try (InputStream inputStream = getContentResolver().openInputStream(fileUri);
         OutputStream outputStream = new FileOutputStream(destFile)) {

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        Toast.makeText(this, "Library added: " + destFile.getAbsolutePath(), Toast.LENGTH_LONG).show();

    } catch (IOException e) {
        Toast.makeText(this, "Failed to get APK path", Toast.LENGTH_SHORT).show();
    }
}

// Helper function to get file name from Uri
private String getFileName(Uri uri) {
    String result = null;
    if (uri.getScheme().equals("content")) {
        try (Cursor cursor = getContentResolver().query(uri, null, null, null, null)) {
            if (cursor != null && cursor.moveToFirst()) {
                result = cursor.getString(cursor.getColumnIndexOrThrow(OpenableColumns.DISPLAY_NAME));
            }
        }
    }
    if (result == null) {
        result = uri.getPath();
        int cut = result.lastIndexOf('/');
        if (cut != -1) {
            result = result.substring(cut + 1);
        }
    }
    return result;
}

*/

    
   @Override
public void onDestroy() {
    super.onDestroy();
   // Execute("/ccc");
    // Stop activity monitoring
  /*  if (activityMonitor != null) {
        activityMonitor.stopMonitoring();
    }
*/
    // Stop services
    stopService(new Intent(this, Overlay.class));
    stopService(new Intent(this, FourService.class));

    // Finish activity completely
    finishAffinity();
}



}
