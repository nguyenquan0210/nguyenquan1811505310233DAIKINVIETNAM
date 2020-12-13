package com.example.thecoffeehouse.tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;
import com.example.thecoffeehouse.model_adapter.tintuc;
import com.example.thecoffeehouse.model_adapter.tintucAdapter;

public class thongbao_list extends Fragment {


    private GridView gvmon_233;
    private tintucAdapter spadt_233;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_tin_tuc, container, false);
        gvmon_233 = r.findViewById(R.id.gv_mon);
        spadt_233 = new tintucAdapter(thongbao_list.this.getActivity(), R.layout.tintucitem);
        gvmon_233.setAdapter(spadt_233);
        registerForContextMenu(gvmon_233);
        fakeData();
    //    addEvents();
        return r;
    }

    private void fakeData() {
        spadt_233.add(new tintuc("Nhanh tay nhận ưu đãi cuối tháng 11", "2 tuần trước"));
        spadt_233.add(new tintuc("Tháng 11 Book Bảo Trì Có Ngay Quà Hay", "1 tháng trước"));
        spadt_233.add(new tintuc("Cùng DAIKIN VIETNAM HƯỚNG VỀ MIỀN TRUNG", "1 tháng trước"));
        spadt_233.add(new tintuc("Thời tiết nồm rồi, bật nay chế đọ Dry khử ẩm", "1 tháng trước"));
        spadt_233.add(new tintuc("Cùng DAIKIN VIETNAM HƯỚNG VỀ MIỀN TRUNG ", "1 tháng trước"));
        spadt_233.add(new tintuc("News", "2 tháng trước"));
        spadt_233.add(new tintuc("News", "2 tháng trước"));
        spadt_233.add(new tintuc("News", "2 tháng trước"));
        spadt_233.add(new tintuc("News", "3 tháng trước"));



    }

//    private void addEvents() {
//        gvmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
//
//                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
//                dialog.setContentView(R.layout.dilg_dathang);
//                dialog.show();
//            }
//        });
//        gvmon.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
//                dialog.setContentView(R.layout.dhang);
//                dialog.show();
//
//                return true;
//            }
//        });
//    }
}