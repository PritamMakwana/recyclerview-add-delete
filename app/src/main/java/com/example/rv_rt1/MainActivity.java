package com.example.rv_rt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyListAdapter.OnCountryClickListener{
     ArrayList<MyListData> listData;
     MyListAdapter myListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.rvmain);

       // MyListData[] myListData=new MyListData[]{
        listData=new ArrayList<>();
         listData.add(new MyListData("India","India (Hindi: Bhārat), officially the Republic of India (Hindi: Bhārat Gaṇarājya),[23] is a country in South Asia. It is the second-most populous country, the seventh-largest country by land area, and the most populous democracy in the world. Bounded by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the west;[f] China, Nepal, and Bhutan to the north; and Bangladesh and Myanmar to the east. In the Indian Ocean, India is in the vicinity of Sri Lanka and the Maldives; its Andaman and Nicobar Islands share a maritime border with Thailand, Myanmar and Indonesia.",R.drawable.india1));
         listData.add (new MyListData("Brazil","Brazil (Portuguese: Brasil; Brazilian Portuguese: [bɾaˈziw]),[nt 4] officially the Federative Republic of Brazil,[a] is the largest country in both South America and Latin America. It covers an area of 8,515,767 square kilometres (3,287,956 sq mi), with a population of over 211 million. Brazil is the world's fifth-largest and sixth-most populous country, composed of 26 states and the Federal District. It is the largest country to have Portuguese as an official language and the only one in the Americas.[12][13] Brazil is also one of the world's most multicultural and ethnically diverse nations, due to over a century of mass immigration from around the world.[14] It is also the most populous Roman Catholic-majority country, and its capital is Brasília, while the largest city is São Paulo.",R.drawable.razil1));
        listData.add( new MyListData("America","Forget The 50 States; The U.S. Is Really 11 Nations, Author Says. Colin Woodard's map of the 11 nations. For hundreds of years, this nation has been known as the United States of America.",R.drawable.merica1));
        listData.add( new MyListData("Germany","In the 2020 Global Peace Index, Germany is ranked 16 out of 163 countries when it comes to safety and peace in the country. In Europe, Germany is ranked 11 out of 36 countries.",R.drawable.ermany1));
        listData.add(new MyListData("Australia","The average cost of living in Australia may be higher than most people expect. While most Australian cities are still relatively cheaper than places like New York City, London, or Paris, the country's vast expanse and remoteness make it an expensive place to live.",R.drawable.ustralia1));
        listData.add(new MyListData("Russia","Russia, country that stretches over a vast expanse of eastern Europe and northern Asia. Once the preeminent republic of the Union of Soviet Socialist Republics (U.S.S.R.; commonly known as the Soviet Union), Russia became an independent country after the dissolution of the Soviet Union in December 1991.",R.drawable.ussia1));
        listData.add(new MyListData("UAE","often referred to as the U.A.E, is a federation of seven emirates on the eastern side of the Arabian peninsula, at the entrance to the Persian Gulf. It has coastlines on the Gulf of Oman and the Persian Gulf, with Saudi Arabia to the west and southwest, and Oman to the southeast and also on the eastern tip of the Musandam Peninsula as well as an Omani enclave within its borders.",R.drawable.uae));
        listData.add(new MyListData("France","France became the most populous country in Europe and had tremendous influence over European politics, economy, and culture. French became the most-used language in diplomacy, science, literature and international affairs, and remained so until the 20th century.",R.drawable.rance1));
        listData.add(new MyListData("Canada","Canada is a country in North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering ...",R.drawable.anada1));
        listData.add(new MyListData("Greece","If you are looking for travel inspiration, visitgreece.gr has everything you need to know. Travel ideas, Events, guides, what to do, where to go in Greece.",R.drawable.reece1));
        listData.add(new MyListData("Shri Lanka","Sri Lanka, formerly Ceylon, island country lying in the Indian Ocean and separated from peninsular India by the Palk Strait. It is located between latitudes 5°55′ and 9°51′ N and longitudes 79°41′ and 81°53′ E and has a maximum length of 268 miles (432 km) and a maximum width of 139 miles (224 km)",R.drawable.hrilanka1));
        listData.add( new MyListData("Japan","Japan is known worldwide for its traditional arts, including tea ceremonies, calligraphy and flower arranging. The country has a legacy of distinctive gardens, sculpture and poetry. Japan is home to more than a dozen UNESCO World Heritage sites and is the birthplace of sushi, one of its most famous culinary exports.",R.drawable.apan1));
        listData.add(new MyListData("Mexico","Mexico covers 1,972,550 square kilometers (761,610 sq mi), making it the world's 13th-largest country by area; with approximately 126,014,024 inhabitants, it is ...",R.drawable.mexico1));
        listData.add(new MyListData("Nepal","Nepal, country of Asia, lying along the southern slopes of the Himalayan mountain ranges. It is a landlocked country located between India to the east, south, and west and the Tibet Autonomous Region of China to the north.",R.drawable.epal1));
        listData.add(new MyListData("Poland","In general, traveling in Poland is safe because the country is highly ranked on the list of the safest countries. In fact, Poland lands in the top 20 of the safest countries in the world! The only threats you might expect are: pickpocketing, petty theft, overcharge, and ATMs scams.",R.drawable.poland1));
        listData.add(new MyListData("Veit nam","All in all, Vietnam is an extremely safe country to travel in. The police keep a pretty tight grip on social order and there are rarely reports of muggings, robberies or sexual assaults. Scams and hassles do exist, particularly in Hanoi, HCMC and Nha Trang (and to a lesser degree in Hoi An).",R.drawable.eitnam));



        myListAdapter =new MyListAdapter(listData,this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myListAdapter);


    }

    @Override
    public void onCountryClick(int cphoto, String cname, String cinfo) {
        Toast.makeText(this,cname,Toast.LENGTH_SHORT).show();
        Intent instant=new Intent(MainActivity.this,Information_Activity.class);
         instant.putExtra("Photo",cphoto);
         instant.putExtra("Title",cname);
         instant.putExtra("Information",cinfo);
         startActivity(instant);
    }

}