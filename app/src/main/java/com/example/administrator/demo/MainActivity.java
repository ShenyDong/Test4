package com.example.administrator.demo;


        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ListView;
        import android.widget.SimpleAdapter;
        import android.widget.Toast;
        import android.widget.AdapterView;
        import android.app.Activity;
        import android.view.Menu;


public class MainActivity extends Activity {
    private int[] imageids = {R.drawable.tiger, R.drawable.lion,
            R.drawable.cat, R.drawable.dog};
    private String[] name = {"Tiger", "Lion", "Cat", "dog"};
    //private List<lt1>
    // private String[] desc = {"", "", "", ""};


    private ListView lt1;
    ArrayList<HashMap<String, String>> list = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Map<String, Object>> listems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> listem = new HashMap<String, Object>();
            listem.put("head", imageids[i]);
            listem.put("name", name[i]);
            // listem.put("desc", desc[i]);
            listems.add(listem);
        }

		/*SimpleAdapter的参数说明
		 * 第一个参数 表示访问整个android应用程序接口，基本上所有的组件都需要
		 * 第二个参数表示生成一个Map(String ,Object)列表选项
		 * 第三个参数表示界面布局的id  表示该文件作为列表项的组件
		 * 第四个参数表示该Map对象的哪些key对应value来生成列表项
		 * 第五个参数表示来填充的组件 Map对象key对应的资源一依次填充组件 顺序有对应关系
		 * 注意的是map对象可以key可以找不到 但组件的必须要有资源填充  因为 找不到key也会返回null 其实就相当于给了一个null资源
		 * 下面的程序中如果 new String[] { "name", "head", "desc","name" } new int[] {R.id.name,R.id.head,R.id.desc,R.id.head}
		 * 这个head的组件会被name资源覆盖
		 * */
        SimpleAdapter simplead = new SimpleAdapter(this, listems,
                R.layout.main, new String[]{"head", "name"},
                new int[]{R.id.head, R.id.name});
        //lt1 = (ListView) findViewById(R.id.lt1);
        //lt1.setAdapter(simplead);
        ListView list = (ListView) findViewById(R.id.lt1);
        // 为ListView设置Adapter
        list.setAdapter(simplead);
        // 为ListView的列表项的单击事件绑定事件监听器
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast toast = Toast.makeText(MainActivity.this, name[position] + "被点击了", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }



}