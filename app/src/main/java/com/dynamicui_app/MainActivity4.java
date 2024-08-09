package com.dynamicui_app;

import android.content.res.ColorStateList;
import android.graphics.Color;
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

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity4 extends AppCompatActivity {

    private String jsonString1 = "{ \"views\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"background\": \"@color/white\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"370dp\", \"background\": \"#01b9ff\" }, \"children\": [ " +
            "{ \"type\": \"ImageView\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"45dp\", \"layout_marginStart\": \"45dp\", \"layout_marginTop\": \"90dp\", \"src\": \"@drawable/dflogo\" } } ] }, " +
            "{ \"type\": \"LinearLayout\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"match_parent\", \"layout_marginTop\": \"-120dp\",  \"background\": \"@drawable/img2\", \"orientation\": \"vertical\" }, \"children\": [ " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"120dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Email\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\", \"layout_margin\": \"10dp\", \"layout_marginLeft\": \"12dp\",\"layout_marginRight\": \"12dp\",\"layout_marginTop\": \"18dp\", \"background\": \"@drawable/shapeemail\", \"textStyle\": \"bold\", \"drawablePadding\": \"10dp\", \"hint\": \"Password\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }, " +
            "{ \"type\": \"Button\", \"properties\": { \"layout_width\": \"150dp\", \"layout_height\": \"wrap_content\",  \"layout_gravity\": \"center_horizontal\", \"layout_marginTop\": \"25dp\", \"backgroundTint\": \"#01b9ff\", \"fontFamily\": \"sans-serif-condensed\", \"text\": \"Submit\", \"textColor\": \"#FFFFFF\", \"textSize\": \"15dp\", \"textStyle\": \"bold\" } } ] } ] } ] }";

    private String jsonString2 = "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"12dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Phno\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01b9ff")));
        }

        LinearLayout design2Container = findViewById(R.id.design2Container);

        // Conditionally add Phno EditText JSON
        String combinedJsonString = addPhnoToJsonString(jsonString1, jsonString2);

        try {
            JSONObject json = new JSONObject(combinedJsonString);
            JSONArray viewsArray = json.getJSONArray("views");

            for (int i = 0; i < viewsArray.length(); i++) {
                JSONObject viewObject = viewsArray.getJSONObject(i);
                View view = createView(viewObject);
                if (view != null) {
                    design2Container.addView(view);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String addPhnoToJsonString(String jsonString1, String jsonString2) {
        // Add the Phno EditText JSON after the Email EditText JSON
        String marker = "{ \"type\": \"EditText\", \"properties\": { \"layout_width\": \"match_parent\", \"layout_height\": \"40dp\",\"layout_marginTop\": \"120dp\", \"background\": \"@drawable/shapeemail\", \"drawablePadding\": \"15dp\", \"textStyle\": \"bold\", \"hint\": \"Email\", \"layout_marginLeft\": \"12dp\", \"layout_marginRight\": \"12dp\", \"paddingLeft\": \"15dp\", \"paddingTop\": \"15dp\", \"paddingRight\": \"15dp\", \"paddingBottom\": \"15dp\" } }";
        String jsonStringWithPhno = jsonString1.replace(marker, marker + ", " + jsonString2);
        return jsonStringWithPhno;
    }

    private View createView(JSONObject viewObject) throws JSONException {
        String type = viewObject.getString("type");
        JSONObject properties = viewObject.getJSONObject("properties");
        View view = null;

        switch (type) {
            case "LinearLayout":
                view = createLinearLayout(properties, viewObject.optJSONArray("children"));
                break;
            case "ImageView":
                view = createImageView(properties);
                break;
            case "EditText":
                view = createEditText(properties);
                break;
            case "Button":
                view = createButton(properties);
                break;
        }
        return view;
    }

    private LinearLayout createLinearLayout(JSONObject properties, JSONArray children) throws JSONException {
        LinearLayout layout = new LinearLayout(this);
        layout.setLayoutParams(createLayoutParams(properties));

        String orientation = properties.optString("orientation", "vertical");
        if ("vertical".equalsIgnoreCase(orientation)) {
            layout.setOrientation(LinearLayout.VERTICAL);
        } else if ("horizontal".equalsIgnoreCase(orientation)) {
            layout.setOrientation(LinearLayout.HORIZONTAL);
        }

        String background = properties.optString("background");
        if (background != null && background.startsWith("@drawable/")) {
            int drawableId = getResources().getIdentifier(background.replace("@drawable/", ""), "drawable", getPackageName());
            layout.setBackgroundResource(drawableId);
        } else {
            layout.setBackgroundColor(parseColor(background));
        }

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

    private ImageView createImageView(JSONObject properties) throws JSONException {
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams params = createLayoutParams(properties);
        params.gravity = Gravity.CENTER;
        imageView.setLayoutParams(params);

        int resId = getResources().getIdentifier(properties.getString("src").replace("@drawable/", ""), "drawable", getPackageName());
        imageView.setImageResource(resId);

        return imageView;
    }

    private EditText createEditText(JSONObject properties) throws JSONException {
        EditText editText = new EditText(this);
        editText.setLayoutParams(createLayoutParams(properties));
        editText.setHint(properties.optString("hint"));
        editText.setPadding(
                parsePadding(properties, "paddingLeft"),
                parsePadding(properties, "paddingTop"),
                parsePadding(properties, "paddingRight"),
                parsePadding(properties, "paddingBottom")
        );

        String background = properties.optString("background");
        if (background != null && background.startsWith("@drawable/")) {
            int drawableId = getResources().getIdentifier(background.replace("@drawable/", ""), "drawable", getPackageName());
            editText.setBackgroundResource(drawableId);
        } else {
            editText.setBackgroundColor(parseColor(background));
        }

        return editText;
    }

    private Button createButton(JSONObject properties) throws JSONException {
        Button button = new Button(this);
        LinearLayout.LayoutParams params = createLayoutParams(properties);
        params.gravity = Gravity.CENTER;
        button.setLayoutParams(params);

        button.setText(properties.getString("text"));
        button.setTextSize(TypedValue.COMPLEX_UNIT_DIP, properties.optInt("textSize", 16));
        button.setTextColor(parseColor(properties.getString("textColor")));

        String backgroundTint = properties.optString("backgroundTint");
        if (backgroundTint != null) {
            button.setBackgroundTintList(ColorStateList.valueOf(parseColor(backgroundTint)));
        }

        button.setOnClickListener(v -> submitFunction());

        return button;
    }

    private LinearLayout.LayoutParams createLayoutParams(JSONObject properties) throws JSONException {
        int width = parseLayoutDimension(properties.getString("layout_width"));
        int height = parseLayoutDimension(properties.getString("layout_height"));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, height);
        params.setMargins(
                parseDimension(properties, "layout_marginLeft"),
                parseDimension(properties, "layout_marginTop"),
                parseDimension(properties, "layout_marginRight"),
                parseDimension(properties, "layout_marginBottom")
        );
        return params;
    }

    private int parseLayoutDimension(String dimension) {
        switch (dimension) {
            case "match_parent":
                return LinearLayout.LayoutParams.MATCH_PARENT;
            case "wrap_content":
                return LinearLayout.LayoutParams.WRAP_CONTENT;
            default:
                return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, Float.parseFloat(dimension.replace("dp", "")), getResources().getDisplayMetrics());
        }
    }

    private int parseColor(String colorString) {
        if (colorString.startsWith("@color/")) {
            int resId = getResources().getIdentifier(colorString.replace("@color/", ""), "color", getPackageName());
            if (resId != 0) {
                return getResources().getColor(resId);
            } else {
                Log.e("MainActivity", "Color resource not found: " + colorString);
                return Color.TRANSPARENT;
            }
        } else {
            try {
                return Color.parseColor(colorString);
            } catch (IllegalArgumentException e) {
                Log.e("MainActivity", "Invalid color string: " + colorString);
                return Color.TRANSPARENT;
            }
        }
    }

    private int parsePadding(JSONObject properties, String side) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, properties.optInt(side, 0), getResources().getDisplayMetrics());
    }

    private int parseDimension(JSONObject properties, String key) {
        if (properties.has(key)) {
            String value = properties.optString(key);
            return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, Float.parseFloat(value.replace("dp", "")), getResources().getDisplayMetrics());
        }
        return 0;
    }

    private void submitFunction() {
        System.out.println("Submit button pressed");
    }
}
