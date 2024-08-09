package com.dynamicui_app;

import static android.content.ContentValues.TAG;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity2 extends AppCompatActivity {

    private String jsonString1 = "{ \"views\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"@color/white\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"370dp\", \"background\": \"#01b9ff\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"45dp\", \"layout_marginStart\": \"45dp\", \"layout_marginTop\": \"90dp\", \"src\": \"@drawable/dflogo\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"layout_marginTop\": \"-120dp\",  \"background\": \"@drawable/img2\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"100dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Email\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_margin\": \"10dp\", \"layout_marginLeft\": \"12dp\",\"layout_marginRight\": \"12dp\",\"layout_marginTop\": \"18dp\", \"background\": \"@drawable/shapeemail\", \"textStyle\": \"bold\", \"drawablePadding\": \"10dp\", \"hint\": \"Password\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"Button\", \"properties\": { \"layout_width\": \"150dp\", \"layout_height\": \"wrap_content\",  \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"25dp\", \"backgroundTint\": \"#01b9ff\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Submit\", \"textColor\": \"#FFFFFF\", \"textSize\": \"15dp\", \"textStyle\": \"bold\" } } ] } ] } ] }";
    private String jsonString2 = "{ \"views\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"@color/white\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"250dp\", \"background\": \"#3F51B5\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"45dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"90dp\", \"src\": \"@drawable/dflogo\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\",   \"background\": \"@drawable/img2\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"60dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Email\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Ph.no\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_margin\": \"10dp\", \"layout_marginLeft\": \"12dp\",\"layout_marginRight\": \"12dp\",\"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"textStyle\": \"bold\", \"drawablePadding\": \"10dp\", \"hint\": \"Password\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"Button\", \"properties\": { \"layout_width\": \"150dp\", \"layout_height\": \"wrap_content\",  \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"25dp\", \"backgroundTint\": \"#3F51B5\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Submit\", \"textColor\": \"#FFFFFF\", \"textSize\": \"15dp\", \"textStyle\": \"bold\" } } ] } ] } ] }";
    private String jsonString3 = "{ \"views\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"@color/white\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"270dp\", \"background\": \"#09AFA0\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"45dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"90dp\", \"src\": \"@drawable/dflogo\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"layout_marginTop\": \"-30dp\",  \"background\": \"@drawable/img1\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"60dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Email\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Ph.no\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_margin\": \"10dp\", \"layout_marginLeft\": \"12dp\",\"layout_marginRight\": \"12dp\",\"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"textStyle\": \"bold\", \"drawablePadding\": \"10dp\", \"hint\": \"Password\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"Button\", \"properties\": { \"layout_width\": \"150dp\", \"layout_height\": \"wrap_content\",  \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"25dp\", \"backgroundTint\": \"#09AFA0\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Submit\", \"textColor\": \"#FFFFFF\", \"textSize\": \"15dp\", \"textStyle\": \"bold\" } } ] } ] } ] }";
    private String jsonString4 = "{ \"views\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"#CFD7FF\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"270dp\", \"background\": \"#CFD7FF\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"45dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"90dp\", \"src\": \"@drawable/dflogo\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"layout_marginTop\": \"-55dp\", \"background\": \"@drawable/img4\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"200dp\", \"layout_margin\": \"10dp\",\"layout_marginTop\": \"55dp\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/cardbackground\", \"cardElevation\": \"4dp\", \"cardCornerRadius\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"@drawable/img2\",\"layout_marginTop\": \"15dp\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Email\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Ph.no\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_margin\": \"10dp\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"textStyle\": \"bold\", \"drawablePadding\": \"10dp\", \"hint\": \"Password\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } } ] } ] }, " +
            "{ \"type\": \"Button\", \"properties\": { \"layout_width\": \"150dp\", \"layout_height\": \"wrap_content\", \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"25dp\", \"backgroundTint\": \"#283593\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Submit\", \"textColor\": \"#FFFFFF\", \"textSize\": \"15dp\", \"textStyle\": \"bold\" } } ] } ] } ] }";


    private String jsonString5 = "{ \"views\": [ " +
            /*mainlayout*/
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"#ffffff\", \"orientation\": \"vertical\" }, \"children\": [ " +


            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"orientation\": \"vertical\", \"layout_height\": \"230dp\", \"background\": \"@drawable/gredient1\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"25dp\", \"layout_marginLeft\": \"25dp\",\"layout_marginTop\": \"15dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"$50.24656 \", \"textColor\": \"#FFFFFF\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"12dp\", \"layout_marginLeft\": \"35dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Availabel Balance \", \"textColor\": \"#FFFFFF\", \"textStyle\": \"bold\" } }, " +

            /*Imageview 1st container*/
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\", \"orientation\": \"horizontal\", \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"35dp\",\"layout_height\": \"100dp\", \"background\": \"@drawable/gredient1\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"60dp\", \"orientation\": \"vertical\", \"layout_height\": \"match_parent\", \"background\": \"@drawable/gredient1\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"50dp\", \"layout_height\": \"50dp\", \"src\": \"@drawable/email\" } } ," +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"13dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"5dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Send \", \"textColor\": \"#FFFFFF\", \"textStyle\": \"bold\" } } ] },  " +

            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"60dp\", \"orientation\": \"vertical\", \"layout_height\": \"match_parent\", \"background\": \"@drawable/gredient1\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"50dp\", \"layout_height\": \"50dp\", \"src\": \"@drawable/profile1\" } } ," +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"13dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"5dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Profile \", \"textColor\": \"#FFFFFF\", \"textStyle\": \"bold\" } } ] },  " +

            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"60dp\", \"orientation\": \"vertical\", \"layout_height\": \"match_parent\", \"background\": \"@drawable/gredient1\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"50dp\", \"layout_height\": \"50dp\", \"src\": \"@drawable/request\" } } ," +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"13dp\", \"layout_marginLeft\": \"5dp\",\"layout_marginTop\": \"5dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Request \", \"textColor\": \"#FFFFFF\", \"textStyle\": \"bold\" } } ] },  " +

            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"60dp\", \"orientation\": \"vertical\", \"layout_height\": \"match_parent\", \"background\": \"@drawable/gredient1\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"50dp\", \"layout_height\": \"50dp\", \"src\": \"@drawable/loan\" } } ," +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"13dp\", \"layout_marginLeft\": \"9dp\",\"layout_marginTop\": \"5dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Loan \", \"textColor\": \"#FFFFFF\", \"textStyle\": \"bold\" } } ] }] } ] } ] },  " +

            /*2nd Container*/
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"layout_marginTop\": \"-515dp\", \"background\": \"@drawable/img4\", \"orientation\": \"vertical\" }, \"children\": [ " +

            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"18dp\", \"layout_marginLeft\": \"15dp\",\"layout_marginTop\": \"15dp\",  \"text\": \"Recent Transactions \", \"fontFamily\": \"sans-serif-condensed\",\"textColor\": \"#1F3C70\", \"textStyle\": \"bold\" } }, " +

            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"41dp\", \"layout_marginLeft\": \"10dp\", \"layout_marginRight\": \"10dp\",\"layout_marginTop\": \"5dp\",\"background\": \"@drawable/gradient1\" ,\"orientation\": \"horizontal\" }, \"children\": [ " +

          /*  3button curve*/
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"72dp\", \"layout_height\": \"35dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginLeft\": \"15dp\", \"background\": \"@drawable/btncurve\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"fontFamily\": \"sans-serif-condensed\", \"layout_marginLeft\": \"24dp\", \"text\": \"All \", \"layout_marginTop\": \"7dp\",\"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"105dp\", \"layout_height\": \"35dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginLeft\": \"12dp\", \"background\": \"@drawable/btncurve\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"gravity\": \"center\", \"layout_marginLeft\": \"24dp\", \"text\": \"Income \",\"layout_marginTop\": \"7dp\",\"textStyle\": \"bold\", \"textColor\": \"#2A346C\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"105dp\", \"layout_height\": \"35dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginLeft\": \"13dp\", \"background\": \"@drawable/btncurve\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"gravity\": \"center\", \"text\": \"Expense \",\"layout_marginTop\": \"7dp\",\"textStyle\": \"bold\", \"layout_marginLeft\": \"24dp\", \"textColor\": \"#2A346C\" } } ] } ] }, " +

            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"15dp\",\"layout_marginTop\": \"5dp\",  \"text\": \"TODAY \", \"fontFamily\": \"sans-serif-condensed\",\"textColor\": \"#777985\", \"textStyle\": \"bold\" } }, " +

            /*1st Cardview*/
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"150dp\", \"layout_margin\": \"10dp\", \"layout_marginTop\": \"5dp\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"background\": \"@drawable/cardbackground\", \"cardElevation\": \"4dp\", \"cardCornerRadius\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\",\"layout_marginTop\": \"3dp\",\"orientation\": \"vertical\", \"layout_marginLeft\": \"2dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +

            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"70dp\",\"layout_marginTop\": \"8dp\",\"orientation\": \"horizontal\", \"layout_marginLeft\": \"12dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"60dp\", \"layout_height\": \"55dp\", \"layout_margin\": \"10dp\", \"layout_marginTop\": \"5dp\", \"layout_marginLeft\": \"2dp\", \"layout_marginRight\": \"12dp\", \"background\": \"@drawable/cardbackground1\", \"cardElevation\": \"4dp\", \"cardCornerRadius\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"45dp\", \"layout_height\": \"45dp\", \"layout_marginLeft\": \"5dp\",\"layout_marginTop\": \"7dp\", \"src\": \"@drawable/shopping\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\",\"layout_marginLeft\": \"16dp\", \"orientation\": \"vertical\", \"layout_height\": \"55dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"8dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Grocery \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"14dp\", \"layout_marginLeft\": \"6dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Indian Town \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] },  " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\", \"orientation\": \"vertical\", \"layout_height\": \"55dp\", \"layout_marginLeft\": \"46dp\",\"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"8dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"$56.89 \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"14dp\", \"layout_marginLeft\": \"6dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Aug 4 \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] } ] },  " +

            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"70dp\",\"layout_marginTop\": \"8dp\",\"orientation\": \"horizontal\", \"layout_marginLeft\": \"12dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"60dp\", \"layout_height\": \"55dp\", \"layout_margin\": \"10dp\", \"layout_marginTop\": \"5dp\", \"layout_marginLeft\": \"2dp\", \"layout_marginRight\": \"12dp\", \"background\": \"@drawable/cardbackground1\", \"cardElevation\": \"4dp\", \"cardCornerRadius\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"45dp\", \"layout_height\": \"45dp\", \"layout_marginLeft\": \"5dp\",\"layout_marginTop\": \"7dp\", \"src\": \"@drawable/lorry\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\",\"layout_marginLeft\": \"16dp\", \"orientation\": \"vertical\", \"layout_height\": \"55dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"8dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Transport \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"14dp\", \"layout_marginLeft\": \"6dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Indian Town \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] },  " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\", \"orientation\": \"vertical\", \"layout_height\": \"55dp\", \"layout_marginLeft\": \"46dp\",\"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"8dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"$56.89 \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"14dp\", \"layout_marginLeft\": \"6dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Aug 4 \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] } ] } ] } ] }, " +


            /*2nd Cardview*/
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"15dp\",\"layout_marginTop\": \"15dp\",  \"text\": \"YESTERDAY \", \"fontFamily\": \"sans-serif-condensed\",\"textColor\": \"#777985\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"100dp\", \"layout_margin\": \"10dp\", \"layout_marginTop\": \"5dp\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"background\": \"@drawable/cardbackground\", \"cardElevation\": \"4dp\", \"cardCornerRadius\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\",\"layout_marginTop\": \"3dp\",\"orientation\": \"vertical\", \"layout_marginLeft\": \"2dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"70dp\",\"layout_marginTop\": \"8dp\",\"orientation\": \"horizontal\", \"layout_marginLeft\": \"12dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"60dp\", \"layout_height\": \"55dp\", \"layout_margin\": \"10dp\", \"layout_marginTop\": \"5dp\", \"layout_marginLeft\": \"2dp\", \"layout_marginRight\": \"12dp\", \"background\": \"@drawable/cardbackground1\", \"cardElevation\": \"4dp\", \"cardCornerRadius\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"45dp\", \"layout_height\": \"45dp\", \"layout_marginLeft\": \"5dp\",\"layout_marginTop\": \"7dp\", \"src\": \"@drawable/credit\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\",\"layout_marginLeft\": \"16dp\", \"orientation\": \"vertical\", \"layout_height\": \"55dp\", \"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"8dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Payment \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"14dp\", \"layout_marginLeft\": \"6dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Indian Town \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] },  " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\", \"orientation\": \"vertical\", \"layout_height\": \"55dp\", \"layout_marginLeft\": \"46dp\",\"background\": \"@drawable/gredient2\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"15dp\", \"layout_marginLeft\": \"6dp\",\"layout_marginTop\": \"8dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"$561.89 \", \"textColor\": \"#4CAF50\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"textSize\": \"14dp\", \"layout_marginLeft\": \"6dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Aug 4 \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] } ] } ] } ] }  " +

            "  ] } ] } ";

/*
    private String jsonString5 = "{ \"views\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"#CFD7FF\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"270dp\", \"background\": \"@drawable/gradient1\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"layout_marginTop\": \"40dp\", \"background\": \"@drawable/gradient1\" ,\"orientation\": \"horizontal\"}, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"45dp\", \"src\": \"@drawable/email\" } }, " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"45dp\", \"src\": \"@drawable/profile1\" } }, " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"45dp\", \"src\": \"@drawable/request\" } }, " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"45dp\", \"layout_gravity\": \"center_horizontal\", \"src\": \"@drawable/loan\" } } ] }]}, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\",\"layout_marginTop\": \"-55dp\", \"background\": \"@drawable/img4\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"200dp\", \"layout_margin\": \"10dp\",\"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/cardbackground\", \"cardElevation\": \"4dp\", \"cardCornerRadius\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"@drawable/img2\",\"layout_marginTop\": \"15dp\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Email\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Ph.no\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_margin\": \"10dp\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"layout_marginTop\": \"15dp\", \"background\": \"@drawable/shapeemail\", \"textStyle\": \"bold\", \"drawablePadding\": \"10dp\", \"hint\": \"Password\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } } ] } ] }, " +
            "{ \"type\": \"Button\", \"properties\": { \"layout_width\": \"150dp\", \"layout_height\": \"wrap_content\", \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"25dp\", \"backgroundTint\": \"#283593\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Submit\", \"textColor\": \"#FFFFFF\", \"textSize\": \"15dp\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"layout_marginTop\": \"-20dp\", \"background\": \"@drawable/curve4\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_marginTop\": \"20dp\", \"background\": \"@drawable/gradient1\" ,\"orientation\": \"horizontal\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"wrap_content\", \"layout_marginStart\": \"20dp\", \"fontFamily\": \"sans-serif-condensed\", \"gravity\": \"center\", \"text\": \"Recent Transaction\", \"textColor\": \"#1F3C70\", \"textSize\": \"20dp\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"wrap_content\", \"layout_marginStart\": \"135dp\", \"fontFamily\": \"sans-serif-condensed\", \"gravity\": \"center\", \"text\": \"See All\", \"textColor\": \"#1F3C70\", \"textSize\": \"15dp\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"41dp\", \"layout_marginStart\": \"5dp\", \"background\": \"@drawable/gradient1\" ,\"orientation\": \"horizontal\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"72dp\", \"layout_height\": \"35dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginStart\": \"10dp\", \"background\": \"@drawable/btncurve\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"fontFamily\": \"sans-serif-condensed\", \"gravity\": \"center\", \"text\": \"All \", \"textColor\": \"#2A346C\", \"textStyle\": \"bold\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"112dp\", \"layout_height\": \"35dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginStart\": \"10dp\", \"background\": \"@drawable/btncurve\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"gravity\": \"center\", \"text\": \"Income \", \"textColor\": \"#2A346C\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"112dp\", \"layout_height\": \"35dp\", \"layout_gravity\": \"center_horizontal\", \"layout_marginStart\": \"10dp\", \"background\": \"@drawable/btncurve\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"gravity\": \"center\", \"text\": \"Expense \", \"textColor\": \"#2A346C\" } } ] } ] }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\", \"layout_marginStart\": \"20dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"TODAY \", \"textColor\": \"#777985\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"CardView\", \"properties\": { \"layout_width\": \"325dp\", \"layout_height\": \"152dp\", \"background\": \"@drawable/cardbackground\",\"layout_marginStart\": \"18dp\", \"layout_marginTop\": \"5dp\", \"cardBackgroundColor\": \"#FFFFFF\", \"cardCornerRadius\": \"10dp\", \"cardElevation\": \"10dp\", \"cardMaxElevation\": \"8dp\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"157dp\",\"background\": \"@drawable/gradient1\" , \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"68dp\",\"background\": \"@drawable/gradient1\" , \"layout_marginTop\": \"8dp\", \"orientation\": \"horizontal\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"50dp\", \"layout_height\": \"45dp\", \"layout_marginTop\": \"10dp\", \"layout_marginStart\": \"20dp\", \"src\": \"@drawable/profile2\" } }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"wrap_content\", \"layout_marginStart\": \"7dp\",\"background\": \"@drawable/gradient1\" , \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\", \"layout_marginTop\": \"10dp\", \"fontFamily\": \"sans-serif-condensed\", \"gravity\": \"center\", \"text\": \"John Doe\", \"textColor\": \"#2A346C\", \"textSize\": \"20dp\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"wrap_content\", \"layout_marginTop\": \"10dp\", \"fontFamily\": \"sans-serif-condensed\", \"gravity\": \"center\", \"text\": \"Personal ID:9876543210\", \"textColor\": \"#000000\", \"textSize\": \"15dp\", \"textStyle\": \"bold\" } } ] }, " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"40dp\", \"layout_height\": \"38dp\", \"layout_gravity\": \"center\", \"src\": \"@drawable/send\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"wrap_content\", \"layout_marginTop\": \"3dp\", \"background\": \"@drawable/gradient1\" ,\"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"wrap_content\", \"layout_marginStart\": \"10dp\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"You sent payment to Amarra Store\", \"textColor\": \"#4D4F5C\", \"textStyle\": \"bold\" } }, " +
            "{ \"type\": \"TextView\", \"properties\": { \"layout_width\": \"wrap_content\", \"layout_height\": \"wrap_content\", \"layout_marginStart\": \"10dp\", \"fontFamily\": \"sans-serif-condensed\", \"layout_marginTop\": \"5dp\", \"text\": \"11:30 AM\", \"textColor\": \"#6D6F7E\", \"textSize\": \"12dp\" } } ] } ] } ] } ] } ] } }";
*/

    private String currentJsonString = jsonString1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String selectedOptionText = getIntent().getStringExtra("selectedOptionText");
        Log.d("MainActivity2", "selectedOptionText: " + selectedOptionText); // Log the value

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            if ("XML 1".equals(selectedOptionText)) {
                actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.colorPrimary)));
                actionBar.show(); // Force UI refresh
            } else if ("XML 2".equals(selectedOptionText)) {
                actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.colorSecondary)));
                actionBar.show(); // Force UI refresh
            }
            else if ("XML 3".equals(selectedOptionText)) {
                actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.colorOnPrimary)));
                actionBar.show();
            }
            else if ("XML 4".equals(selectedOptionText)) {
                actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.purple_500)));
                actionBar.show();
            }
            else if ("XML 5".equals(selectedOptionText)) {
                actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.purple_700)));
                actionBar.show();
            }



        }

        LinearLayout layout = findViewById(R.id.mainLayout);

        String jsonStringToUse = null;
        if ("XML 1".equals(selectedOptionText)) {
            jsonStringToUse = jsonString1;
        } else if ("XML 2".equals(selectedOptionText)) {
            jsonStringToUse = jsonString2;
        }
        else if ("XML 3".equals(selectedOptionText)) {
            jsonStringToUse = jsonString3;
        }
        else if ("XML 4".equals(selectedOptionText)) {
            jsonStringToUse = jsonString4;
        }
        else if ("XML 5".equals(selectedOptionText)) {
            jsonStringToUse = jsonString5;
        }





      /*  if (jsonStringToUse != null) {
            // Log the received text
            Log.d(TAG, "Selected JSON: " + jsonStringToUse);

            try {
                // Parse the selected JSON string
                JSONObject json = new JSONObject(jsonStringToUse);
                JSONArray viewsArray = json.getJSONArray("views");

                for (int i = 0; i < viewsArray.length(); i++) {
                    JSONObject viewObject = viewsArray.getJSONObject(i);
                    View view = createView(viewObject);
                    if (view != null) {
                        layout.addView(view);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            // Handle the case where no valid JSON string is found
            Log.d(TAG, "No valid JSON string to display");
        }
    }*/
        try {
            JSONObject jsonObject = new JSONObject(jsonStringToUse);
            JSONArray viewsArray = jsonObject.getJSONArray("views");

            for (int i = 0; i < viewsArray.length(); i++) {
                JSONObject viewObject = viewsArray.getJSONObject(i);
                View view = createView(viewObject);
                if (view != null) {
                    layout.addView(view);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private View createView(JSONObject viewObject) throws JSONException {
        String type = viewObject.getString("type");
        JSONObject properties = viewObject.getJSONObject("properties");
        JSONArray children = viewObject.optJSONArray("children");

        switch (type) {
            case "LinearLayout":
                return createLinearLayout(properties, children);
            case "ImageView":
                return createImageView(properties);
            case "EditText":
                return createEditText(properties);
            case "Button":
                return createButton(properties);
            case "TextView":
                return createTextView(properties);
            case "CardView":
                return createCardView(properties, children);
            default:
                return null;
        }
    }

    private LinearLayout createLinearLayout(JSONObject properties, JSONArray children) throws JSONException {
        LinearLayout layout = new LinearLayout(this);
        layout.setLayoutParams(createLayoutParams(properties));
        layout.setOrientation(properties.optString("orientation", "vertical").equals("horizontal") ? LinearLayout.HORIZONTAL : LinearLayout.VERTICAL);

        // Handle background
        String background = properties.optString("background");
        if (background != null && background.startsWith("@drawable/")) {
            int drawableId = getResources().getIdentifier(background.replace("@drawable/", ""), "drawable", getPackageName());
            layout.setBackgroundResource(drawableId);
        } else {
            layout.setBackgroundColor(parseColor(background));
        }

        // Add child views
        if (children != null) {
            for (int i = 0; i < children.length(); i++) {
                JSONObject childObject = children.getJSONObject(i);
                View childView = createView(childObject);
                if (childView != null) {
                    layout.addView(childView);
                }
            }
        }
        return layout;
    }

    private CardView createCardView(JSONObject properties, JSONArray children) throws JSONException {
        CardView cardView = new CardView(this);
        cardView.setLayoutParams(createLayoutParams(properties));

        // Handle card properties
        cardView.setCardElevation(parseDimension(properties.optString("cardElevation", "4dp")));
        cardView.setRadius(parseDimension(properties.optString("cardCornerRadius", "8dp")));

        // Handle background
        String background = properties.optString("background");
        if (background != null && background.startsWith("@drawable/")) {
            int drawableId = getResources().getIdentifier(background.replace("@drawable/", ""), "drawable", getPackageName());
            cardView.setBackgroundResource(drawableId);
        } else {
            cardView.setBackgroundColor(parseColor(background));
        }

        // Add child views
        if (children != null) {
            for (int i = 0; i < children.length(); i++) {
                JSONObject childObject = children.getJSONObject(i);
                View childView = createView(childObject);
                if (childView != null) {
                    cardView.addView(childView);
                }
            }
        }
        return cardView;
    }

    private ImageView createImageView(JSONObject properties) throws JSONException {
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(createLayoutParams(properties));

        // Set image source
        String src = properties.optString("src");
        if (src != null && src.startsWith("@drawable/")) {
            int drawableId = getResources().getIdentifier(src.replace("@drawable/", ""), "drawable", getPackageName());
            if (drawableId != 0) {
                imageView.setImageResource(drawableId);
            }
        }

        return imageView;
    }

    private EditText createEditText(JSONObject properties) throws JSONException {
        EditText editText = new EditText(this);
        editText.setLayoutParams(createLayoutParams(properties));

        // Set hint
        editText.setHint(properties.optString("hint"));

        // Set padding
        editText.setPadding(
                parseDimension(properties.optString("paddingLeft", "0dp")),
                parseDimension(properties.optString("paddingTop", "0dp")),
                parseDimension(properties.optString("paddingRight", "0dp")),
                parseDimension(properties.optString("paddingBottom", "0dp"))
        );

        // Set background
        String background = properties.optString("background");
        if (background != null && background.startsWith("@drawable/")) {
            int drawableId = getResources().getIdentifier(background.replace("@drawable/", ""), "drawable", getPackageName());
            if (drawableId != 0) {
                editText.setBackgroundResource(drawableId);
            }
        } else {
            editText.setBackgroundColor(parseColor(background));
        }

        return editText;
    }

    private Button createButton(JSONObject properties) throws JSONException {
        Button button = new Button(this);
        button.setLayoutParams(createLayoutParams(properties));

        // Set text
        button.setText(properties.optString("text", ""));
        button.setTextSize(TypedValue.COMPLEX_UNIT_PX, parseDimension(properties.optString("textSize", "15dp")));
        button.setTypeface(null, parseTextStyle(properties.optString("textStyle", "normal")));
        button.setTextColor(parseColor(properties.optString("textColor", "#000000")));

        // Set background tint
        String backgroundTint = properties.optString("backgroundTint");
        if (backgroundTint != null) {
            button.setBackgroundTintList(ColorStateList.valueOf(parseColor(backgroundTint)));
        }

        return button;
    }

    private TextView createTextView(JSONObject properties) throws JSONException {
        TextView textView = new TextView(this);
        textView.setLayoutParams(createLayoutParams(properties));

        // Set text
        textView.setText(properties.optString("text", ""));

        // Set text size
        String textSize = properties.optString("textSize", "15dp");
        if (!textSize.isEmpty()) {
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, parseDimension(textSize));
        }

        // Set text style
        textView.setTypeface(null, parseTextStyle(properties.optString("textStyle", "normal")));

        // Set text color
        String textColor = properties.optString("textColor", "#000000");
        if (!textColor.isEmpty()) {
            textView.setTextColor(Color.parseColor(textColor));
        }

        return textView;
    }

    private LinearLayout.LayoutParams createLayoutParams(JSONObject properties) throws JSONException {
        int width = parseLayoutDimension(properties.optString("layout_width"));
        int height = parseLayoutDimension(properties.optString("layout_height"));

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);

        // Set margins
        layoutParams.setMargins(
                parseDimension(properties.optString("layout_marginLeft", "0dp")),
                parseDimension(properties.optString("layout_marginTop", "0dp")),
                parseDimension(properties.optString("layout_marginRight", "0dp")),
                parseDimension(properties.optString("layout_marginBottom", "0dp"))
        );

        // Set gravity
        String gravity = properties.optString("layout_gravity");
        if (gravity != null) {
            layoutParams.gravity = parseGravity(gravity);
        }

        return layoutParams;
    }

    private int parseLayoutDimension(String value) {
        switch (value) {
            case "match_parent":
                return LinearLayout.LayoutParams.MATCH_PARENT;
            case "wrap_content":
                return LinearLayout.LayoutParams.WRAP_CONTENT;
            default:
                return parseDimension(value);
        }
    }

    private int parseDimension(String value) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, Float.parseFloat(value.replace("dp", "")), getResources().getDisplayMetrics());
    }

    private int parseColor(String value) {
        if (value != null && value.startsWith("#")) {
            return Color.parseColor(value);
        } else {
            return ContextCompat.getColor(this, getResources().getIdentifier(value.replace("@color/", ""), "color", getPackageName()));
        }
    }

    private int parseTextStyle(String value) {
        switch (value.toLowerCase()) {
            case "bold":
                return Typeface.BOLD;
            case "italic":
                return Typeface.ITALIC;
            case "bold_italic":
                return Typeface.BOLD_ITALIC;
            default:
                return Typeface.NORMAL;
        }
    }

    private int parseGravity(String value) {
        switch (value.toLowerCase()) {
            case "center":
                return Gravity.CENTER;
            case "center_horizontal":
                return Gravity.CENTER_HORIZONTAL;
            case "center_vertical":
                return Gravity.CENTER_VERTICAL;
            case "left":
                return Gravity.LEFT;
            case "right":
                return Gravity.RIGHT;
            case "top":
                return Gravity.TOP;
            case "bottom":
                return Gravity.BOTTOM;
            default:
                return Gravity.NO_GRAVITY;
        }
    }
}
