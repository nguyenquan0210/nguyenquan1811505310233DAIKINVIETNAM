package com.example.thecoffeehouse;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState_233) {
        AlertDialog.Builder builder_233 = new AlertDialog.Builder(getActivity());
        builder_233.setTitle("Xác nhận");
        builder_233.setMessage("Bạn có chắc chắn đánh dấu đã xem tất cả các thông báo?");
        builder_233.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface_233, int i_233) {
            }
        });
        builder_233.setNegativeButton("Hủy bỏ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface_233, int i_233) {
            }
        });
        return builder_233.show();
    }
}
