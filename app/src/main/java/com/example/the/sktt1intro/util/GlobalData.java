package com.example.the.sktt1intro.util;

import com.example.the.sktt1intro.data.Coach;
import com.example.the.sktt1intro.data.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-10-18.
 */

public class GlobalData {
    public static List<Player> players = new ArrayList<>();
    public static List<Coach> coachs = new ArrayList<>();

    public static void initGlobalData() {
        players.clear();
        players.add(new Player(4, "허승훈", "1997.12.25 (-)", "맛집 탐방", "Huni", "TOP", "-", "CM storm Rapid1", "레이저 DeathAdder", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_top_hsh_2.png"));
        players.add(new Player(5, "이상혁", "1996.05.07", "독서", "SKT T1 Faker", "MID", "르블랑", "블랙위도우 울티매이트 스탤스", "데스에더 크로마", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_mid_lsh_2.png"));
        players.add(new Player(6, "강선구", "1998.04.30 (-)", "음악듣기", "SKT T1 BIank", "JUNGLE", "렉사이, 엘리스", "CORSAIR GAMING K70", "Sensei Fnatic 레이저", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_jungle_ksg_2.png"));
        players.add(new Player(7, "배준식", "1996.05.18", "보드게임", "SKT T1 Bang", "AD", "이즈리얼", "블랙위도우 토너먼트", "데스에더 크로마", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_ad_bjs_2.png"));
        players.add(new Player(8, "박의진", "1996.12.31 (-)", "-", "Untara", "TOP", "뽀삐, 피오라", "-", "-", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_top_puj_1.png"));
        players.add(new Player(9, "김하늘", "1998.07.17 (-)", "영화감상", "Sky", "MID", "-", "Deck cbl-108 덱헤슘", "팀 스콜피온 X-Luna", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_mid_khn_1_1.png"));
        players.add(new Player(10, "한왕호", "1998.02.03 (-)", "게임", "Peanut", "JUNGLE", "-", "레이저 블랙위도우", "로지텍 G1", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_jungle_hwh_1.png"));
        players.add(new Player(11, "이재완", "1996.09.09", "게임, 음악감상", "SKT T1 Wolf", "SUPPORT", "블리츠크랭크", "블랙위도우 울티메이 스텔스", "우로보로스", "http://www.sksports.net/Common/Attach/T1LOLPlayer/lol_support_ljh_2.png"));

        coachs.clear();
        coachs.add(new Coach(1, "최병훈 (Choi Byeong Hun)", "1984.04.05", "최벵", "음악감상,웹서핑", "없음", "cCarter", "삼성 DT-35", "로지텍미니옵", "http://www.sksports.net/IMG/T1/contents/img01_sfcoachview.png"));
        coachs.add(new Coach(2, "김정균(Kim Jeong Gyun)", "1985.12.23", "꼬형", "레고,음악감상", "헬스", "김정균", "Razer BlackWidow Tournament Edition KR", "레이저 맘바 4G Razer Mamba", "http://www.sksports.net/IMG/T1/contents/img01_lolcoachview.png"));
        coachs.add(new Coach(3, "정민성(Jung Min Seong)", "1993.05.05", "없음", "게임", "게임", "Rapidstar", "레이저 블랙위도우", "레이저 어비수스", "http://www.sksports.net/IMG/T1/contents/img03_lolcoachview.png"));
    }
}
