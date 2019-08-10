package dcdmod.Actions;

public class DecadeAnimationAction {
	
	public static String [] JSON = {
    		"",
			"img/char/DCD_Animation/decade/decade_normal.json",//1
			"img/char/DCD_Animation/decade/decade_henshin.json",//2
			"img/char/DCD_Animation/decade/decade_victory.json",//3
			"img/char/DCD_Animation/kuuga/kuuga_normal.json",//4
			"img/char/DCD_Animation/kuuga/kuuga_dcdtokuuga.json",//5
			"img/char/DCD_Animation/kuuga/kuuga_backtodcd.json",//6
			"img/char/DCD_Animation/kuuga/dragon/kuuga_Dragon.json",//7
			"img/char/DCD_Animation/kuuga/pegasus/kuuga_Pegasus.json",//8
			"img/char/DCD_Animation/kuuga/titan/kuuga_Titan.json",//9
			"img/char/DCD_Animation/kuuga/kuuga_allformbacktodcd.json",//10
			"img/char/DCD_Animation/agito/agito_backtodcd.json",//11
			"img/char/DCD_Animation/agito/agito_dcdtoagito.json",//12
			"img/char/DCD_Animation/agito/agito_flame.json",//13
			"img/char/DCD_Animation/agito/agito_normal.json",//14
			"img/char/DCD_Animation/agito/agito_storm.json",//15
			"img/char/DCD_Animation/agito/agito_normal_p.json",//16
			"img/char/DCD_Animation/agito/agito_normal_t.json",//17
			"img/char/DCD_Animation/agito/agito_normal_tp.json",//18
			"img/char/DCD_Animation/agito/agito_power_t.json",//19
			"img/char/DCD_Animation/agito/agito_power.json",//20
			"img/char/DCD_Animation/agito/agito_trinity.json",//21
			"img/char/DCD_Animation/ryuki/ryuki_attack.json",//22
			"img/char/DCD_Animation/ryuki/ryuki_backtodcd.json",//23
			"img/char/DCD_Animation/ryuki/ryuki_defend.json",//24
			"img/char/DCD_Animation/ryuki/ryuki_guard.json",//25
			"img/char/DCD_Animation/ryuki/ryuki_guardattack.json",//26
			"img/char/DCD_Animation/ryuki/ryuki_guardstrike.json",//27
			"img/char/DCD_Animation/ryuki/ryuki_henshin.json",//28
			"img/char/DCD_Animation/ryuki/ryuki_henshintonormal.json",//29
			"img/char/DCD_Animation/ryuki/ryuki_normal.json",//30
			"img/char/DCD_Animation/ryuki/ryuki_strike.json",//31
			"img/char/DCD_Animation/ryuki/ryuki_strikeattack.json",//32
			"img/char/DCD_Animation/faiz/faiz_FAR1.json",//33
			"img/char/DCD_Animation/faiz/faiz_normal.json",//34
			"img/char/DCD_Animation/faiz/faiz_henshin.json",//35
			"img/char/DCD_Animation/faiz/faiz_FAR0.json",//36
			"img/char/DCD_Animation/faiz/faiz_backtodcd.json",//37
			"img/char/DCD_Animation/faiz/faiz_gunattack.json",//38
			"img/char/DCD_Animation/faiz_Axel/Axel_henshin.json",//39
			"img/char/DCD_Animation/faiz_Axel/Axel_normal.json",//40
			"img/char/DCD_Animation/faiz_Axel/Axel_backtofaiz.json",//41
			"img/char/DCD_Animation/faiz_Axel/faiz_Axel_attack.json",//42
			"img/char/DCD_Animation/decade/decade_kamenride_kamenride.json",//43
			"img/char/DCD_Animation/decade/decade_kamenride_timer.json",//44
			"img/char/DCD_Animation/blade/blade_normal.json",//45
			"img/char/DCD_Animation/blade/jackform_normal.json",//46
			"img/char/DCD_Animation/blade/blade_backtodcd.json",//47
			"img/char/DCD_Animation/blade/jack_henshin1.json",//48
			"img/char/DCD_Animation/hibiki/hibiki_normal.json",//49
			"img/char/DCD_Animation/hibiki/hibiki_backtodcd.json",//50
			"img/char/DCD_Animation/hibiki/hibiki_taikoprepare.json",//51
			"img/char/DCD_Animation/hibiki/hibiki_taikoprepare2_prepare.json",//52
			"img/char/DCD_Animation/hibiki/hibiki_taikoprepare2_stop.json",//53
			"img/char/DCD_Animation/hibiki/hibiki_kurenai_henshin0.json",//54
			"img/char/DCD_Animation/hibiki/hibiki_kurenai_normal.json",//55
			"img/char/DCD_Animation/hibiki/hibiki_attack1.json",//56
			"img/char/DCD_Animation/hibiki/hibiki_attack2.json",//57
			"img/char/DCD_Animation/hibiki/hibiki_attack3.json",//58
			"img/char/DCD_Animation/kabuto/kabuto_henshin.json",//59
			"img/char/DCD_Animation/kabuto/kabuto_normal.json",//60
			"img/char/DCD_Animation/kabuto/kamenform_normal.json",//61
			"img/char/DCD_Animation/kabuto/kamenriderswitch_tokamenform.json",//62
			"img/char/DCD_Animation/kabuto/kamenriderswitch_toriderform.json",//63
			"img/char/DCD_Animation/kabuto/kabuto_backtodcd.json",//64
			"img/char/DCD_Animation/deno/deno_backtodcd.json",//65
			"img/char/DCD_Animation/deno/deno_normal.json",//66
			"img/char/DCD_Animation/deno/deno_henshin.json",//67
			"img/char/DCD_Animation/deno/deno_bokuni_tsurarete_miru.json",//68
			"img/char/DCD_Animation/deno/deno_kotaewa_kiite_nai.json",//69
			"img/char/DCD_Animation/deno/deno_nakerude.json",//70
			"img/char/DCD_Animation/decade/FAR/Decade_FAR1.json",//71
			"img/char/DCD_Animation/decade/FAR/Decade_FAR2.json",//72
			"img/char/DCD_Animation/decade/FAR/Decade_FAR3.json",//73
			"img/char/DCD_Animation/decade/FAR/Decade_FAR_kick.json",//74
			"img/char/DCD_Animation/decade/decade_FAR.json",//75
			"img/char/DCD_Animation/decade/decade_attack.json",//76
			"img/char/DCD_Animation/decade/decade_attacked.json",//77
			"img/char/DCD_Animation/decade/riderbooker_attack.json",//78
			"img/char/DCD_Animation/decade/riderbooker_shoot.json",//79
			"img/char/DCD_Animation/decade/decade_blast.json",//80
			"img/char/DCD_Animation/decade/decade_defend.json",//81
			"img/char/DCD_Animation/decade/decade_slash1.json",//82
			"img/char/DCD_Animation/decade/decade_slash2.json",//83
			"img/char/DCD_Animation/decade/decade_slash3.json",//84
			"img/char/DCD_Animation/kuuga/kuugatonormal.json",//85
			"img/char/DCD_Animation/kuuga/kuuga_attack.json",//86
			"img/char/DCD_Animation/kuuga/kuuga_defend.json",//87
			"img/char/DCD_Animation/kuuga/kuuga_attacked.json",//88
			"img/char/DCD_Animation/kuuga/kuuga_roll.json",//89
			"img/char/DCD_Animation/kuuga/kuuga_unarmed1.json",//90
			"img/char/DCD_Animation/kuuga/kuuga_unarmed3.json",//91
			"img/char/DCD_Animation/kuuga/kuuga_unarmed4.json",//92
			"img/char/DCD_Animation/kuuga/kuuga_unarmed5.json",//93
			"img/char/DCD_Animation/kuuga/kuuga_unarmed6.json",//94
			"img/char/DCD_Animation/kuuga/kuuga_unarmed7.json",//95
			"img/char/DCD_Animation/kuuga/kuuga_unarmed8.json",//96
			"img/char/DCD_Animation/kuuga/kuuga_unarmed9.json",//97
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR1.json",//98
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR2.json",//99
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR3.json",//100
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR4.json",//101
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR5.json",//102
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR6.json",//103
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR7.json",//104
			"img/char/DCD_Animation/kuuga/kuuga_kamenride.json",//105
			"img/char/DCD_Animation/kuuga/dragon/kuuga_todragon.json",//106
			"img/char/DCD_Animation/kuuga/titan/kuuga_totitan.json",//107
			"img/char/DCD_Animation/kuuga/pegasus/kuuga_topegasus.json",//108
			"img/char/DCD_Animation/kuuga/dragon/dragon_attack1.json",//109
			"img/char/DCD_Animation/kuuga/dragon/dragon_attack2.json",//110
			"img/char/DCD_Animation/kuuga/dragon/dragon_attack3.json",//111
			"img/char/DCD_Animation/kuuga/dragon/dragon_finalattack.json",//112
			"img/char/DCD_Animation/kuuga/dragon/dragon_FAR1.json",//113
			"img/char/DCD_Animation/kuuga/kuuga_dash.json",//114
			"img/char/DCD_Animation/kuuga/titan/titan_defend.json",//115
			"img/char/DCD_Animation/kuuga/titan/titan_attack1.json",//116
			"img/char/DCD_Animation/kuuga/titan/titan_attack2.json",//117
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_1and4_FAR1.json",//118
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_1and4_FAR4-1.json",//119
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_1and4_FAR4-2.json",//120
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3_FAR2-1.json",//121
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3_FAR2-2.json",//122
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3_FAR3-1.json",//123
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3_FAR3-2.json",//124
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R1.json",//125
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R2.json",//126
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R3.json",//127
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R4.json",//128
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R5.json",//129
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R6.json",//130
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R7.json",//131
			"img/char/DCD_Animation/kuuga/pegasus/pegasus_attack.json",//132
			"img/char/DCD_Animation/kuuga/pegasus/pegasus_attack2.json",//133
			"img/char/DCD_Animation/kuuga/pegasus/FAR-R/pegasus_far-r1.json",//134
			"img/char/DCD_Animation/kuuga/pegasus/FAR-R/pegasus_far-r2.json",//135
			"img/char/DCD_Animation/kuuga/pegasus/FAR-R/pegasus_far-r3.json",//136
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram1.json",//137
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram2.json",//138
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram3.json",//139
			"img/char/DCD_Animation/kuuga/gouram/gouram_attack.json",//140
			"img/char/DCD_Animation/kuuga/gouram/gouram_attack2.json",//141
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram4.json",//142
			"img/char/DCD_Animation/kuuga/kuuga_tomighty.json"//143
    		};
	
	public static String [] ATLAS = {
			"",//0
			"img/char/DCD_Animation/decade/decade_normal.atlas",//1
			"img/char/DCD_Animation/decade/decade_henshin.atlas",//2
			"img/char/DCD_Animation/decade/decade_victory.atlas",//3
			"img/char/DCD_Animation/kuuga/kuuga_normal.atlas",//4
			"img/char/DCD_Animation/kuuga/kuuga_dcdtokuuga.atlas",//5
			"img/char/DCD_Animation/kuuga/kuuga_backtodcd.atlas",//6
			"img/char/DCD_Animation/kuuga/dragon/kuuga_Dragon.atlas",//7
			"img/char/DCD_Animation/kuuga/pegasus/kuuga_Pegasus.atlas",//8
			"img/char/DCD_Animation/kuuga/titan/kuuga_Titan.atlas",//9
			"img/char/DCD_Animation/kuuga/kuuga_allformbacktodcd.atlas",//10
			"img/char/DCD_Animation/agito/agito_backtodcd.atlas",//11
			"img/char/DCD_Animation/agito/agito_dcdtoagito.atlas",//12
			"img/char/DCD_Animation/agito/agito_flame.atlas",//13
			"img/char/DCD_Animation/agito/agito_normal.atlas",//14
			"img/char/DCD_Animation/agito/agito_storm.atlas",//15
			"img/char/DCD_Animation/agito/agito_normal_p.atlas",//16
			"img/char/DCD_Animation/agito/agito_normal_t.atlas",//17
			"img/char/DCD_Animation/agito/agito_normal_tp.atlas",//18
			"img/char/DCD_Animation/agito/agito_power_t.atlas",//19
			"img/char/DCD_Animation/agito/agito_power.atlas",//20
			"img/char/DCD_Animation/agito/agito_trinity.atlas",//21
			"img/char/DCD_Animation/ryuki/ryuki_attack.atlas",//22
			"img/char/DCD_Animation/ryuki/ryuki_backtodcd.atlas",//23
			"img/char/DCD_Animation/ryuki/ryuki_defend.atlas",//24
			"img/char/DCD_Animation/ryuki/ryuki_guard.atlas",//25
			"img/char/DCD_Animation/ryuki/ryuki_guardattack.atlas",//26
			"img/char/DCD_Animation/ryuki/ryuki_guardstrike.atlas",//27
			"img/char/DCD_Animation/ryuki/ryuki_henshin.atlas",//28
			"img/char/DCD_Animation/ryuki/ryuki_henshintonormal.atlas",//29
			"img/char/DCD_Animation/ryuki/ryuki_normal.atlas",//30
			"img/char/DCD_Animation/ryuki/ryuki_strike.atlas",//31
			"img/char/DCD_Animation/ryuki/ryuki_strikeattack.atlas",//32
			"img/char/DCD_Animation/faiz/faiz_FAR1.atlas",//33
			"img/char/DCD_Animation/faiz/faiz_normal.atlas",//34
			"img/char/DCD_Animation/faiz/faiz_henshin.atlas",//35
			"img/char/DCD_Animation/faiz/faiz_FAR0.atlas",//36
			"img/char/DCD_Animation/faiz/faiz_backtodcd.atlas",//37
			"img/char/DCD_Animation/faiz/faiz_gunattack.atlas",//38
			"img/char/DCD_Animation/faiz_Axel/Axel_henshin.atlas",//39
			"img/char/DCD_Animation/faiz_Axel/Axel_normal.atlas",//40
			"img/char/DCD_Animation/faiz_Axel/Axel_backtofaiz.atlas",//41
			"img/char/DCD_Animation/faiz_Axel/faiz_Axel_attack.atlas",//42
			"img/char/DCD_Animation/decade/decade_kamenride.atlas",//43
			"img/char/DCD_Animation/decade/decade_kamenride.atlas",//44
			"img/char/DCD_Animation/blade/blade_normal.atlas",//45
			"img/char/DCD_Animation/blade/jackform_normal.atlas",//46
			"img/char/DCD_Animation/blade/blade_backtodcd.atlas",//47
			"img/char/DCD_Animation/blade/jack_henshin1.atlas",//48
			"img/char/DCD_Animation/hibiki/hibiki_normal.atlas",//49
			"img/char/DCD_Animation/hibiki/hibiki_backtodcd.atlas",//50
			"img/char/DCD_Animation/hibiki/hibiki_taikoprepare.atlas",//51
			"img/char/DCD_Animation/hibiki/hibiki_taikoprepare2.atlas",//52
			"img/char/DCD_Animation/hibiki/hibiki_taikoprepare2.atlas",//53
			"img/char/DCD_Animation/hibiki/hibiki_kurenai_henshin0.atlas",//54
			"img/char/DCD_Animation/hibiki/hibiki_kurenai_normal.atlas",//55
			"img/char/DCD_Animation/hibiki/hibiki_attack1.atlas",//56
			"img/char/DCD_Animation/hibiki/hibiki_attack2.atlas",//57
			"img/char/DCD_Animation/hibiki/hibiki_attack3.atlas",//58
			"img/char/DCD_Animation/kabuto/kabuto_henshin.atlas",//59
			"img/char/DCD_Animation/kabuto/kabuto_normal.atlas",//60
			"img/char/DCD_Animation/kabuto/kamenform_normal.atlas",//61
			"img/char/DCD_Animation/kabuto/kamenriderswitch.atlas",//62
			"img/char/DCD_Animation/kabuto/kamenriderswitch.atlas",//63
			"img/char/DCD_Animation/kabuto/kabuto_backtodcd.atlas",//64
			"img/char/DCD_Animation/deno/deno_backtodcd.atlas",//65
			"img/char/DCD_Animation/deno/deno_normal.atlas",//66
			"img/char/DCD_Animation/deno/deno_henshin.atlas",//67
			"img/char/DCD_Animation/deno/deno_bokuni_tsurarete_miru.atlas",//68
			"img/char/DCD_Animation/deno/deno_kotaewa_kiite_nai.atlas",//69
			"img/char/DCD_Animation/deno/deno_nakerude.atlas",//70
			"img/char/DCD_Animation/decade/FAR/Decade_FAR1.atlas",//71
			"img/char/DCD_Animation/decade/FAR/Decade_FAR2.atlas",//72
			"img/char/DCD_Animation/decade/FAR/Decade_FAR3.atlas",//73
			"img/char/DCD_Animation/decade/FAR/Decade_FAR_kick.atlas",//74
			"img/char/DCD_Animation/decade/decade_FAR.atlas",//75
			"img/char/DCD_Animation/decade/decade_attack.atlas",//76
			"img/char/DCD_Animation/decade/decade_attacked.atlas",//77
			"img/char/DCD_Animation/decade/riderbooker_attack.atlas",//78
			"img/char/DCD_Animation/decade/riderbooker_shoot.atlas",//79
			"img/char/DCD_Animation/decade/decade_blast.atlas",//80
			"img/char/DCD_Animation/decade/decade_defend.atlas",//81
			"img/char/DCD_Animation/decade/decade_slash1.atlas",//82
			"img/char/DCD_Animation/decade/decade_slash2.atlas",//83
			"img/char/DCD_Animation/decade/decade_slash3.atlas",//84
			"img/char/DCD_Animation/kuuga/kuugatonormal.atlas",//85
			"img/char/DCD_Animation/kuuga/kuuga_attack.atlas",//86
			"img/char/DCD_Animation/kuuga/kuuga_defend.atlas",//87
			"img/char/DCD_Animation/kuuga/kuuga_attacked.atlas",//88
			"img/char/DCD_Animation/kuuga/kuuga_roll.atlas",//89
			"img/char/DCD_Animation/kuuga/kuuga_unarmed1.atlas",//90
			"img/char/DCD_Animation/kuuga/kuuga_unarmed3.atlas",//91
			"img/char/DCD_Animation/kuuga/kuuga_unarmed4.atlas",//92
			"img/char/DCD_Animation/kuuga/kuuga_unarmed5.atlas",//93
			"img/char/DCD_Animation/kuuga/kuuga_unarmed6.atlas",//94
			"img/char/DCD_Animation/kuuga/kuuga_unarmed7.atlas",//95
			"img/char/DCD_Animation/kuuga/kuuga_unarmed8.atlas",//96
			"img/char/DCD_Animation/kuuga/kuuga_unarmed9.atlas",//97
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR1.atlas",//98
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR2.atlas",//99
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR3.atlas",//100
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR4.atlas",//101
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR5.atlas",//102
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR6.atlas",//103
			"img/char/DCD_Animation/kuuga/FAR/Kuuga_FAR7.atlas",//104
			"img/char/DCD_Animation/kuuga/kuuga_kamenride.atlas",//105
			"img/char/DCD_Animation/kuuga/dragon/kuuga_todragon.atlas",//106
			"img/char/DCD_Animation/kuuga/titan/kuuga_totitan.atlas",//107
			"img/char/DCD_Animation/kuuga/pegasus/kuuga_topegasus.atlas",//108
			"img/char/DCD_Animation/kuuga/dragon/dragon_attack1.atlas",//109
			"img/char/DCD_Animation/kuuga/dragon/dragon_attack2.atlas",//110
			"img/char/DCD_Animation/kuuga/dragon/dragon_attack3.atlas",//111
			"img/char/DCD_Animation/kuuga/dragon/dragon_finalattack.atlas",//112
			"img/char/DCD_Animation/kuuga/dragon/dragon_FAR1.atlas",//113
			"img/char/DCD_Animation/kuuga/kuuga_dash.atlas",//114
			"img/char/DCD_Animation/kuuga/titan/titan_defend.atlas",//115
			"img/char/DCD_Animation/kuuga/titan/titan_attack1.atlas",//116
			"img/char/DCD_Animation/kuuga/titan/titan_attack2.atlas",//117
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_1and4.atlas",//118
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_1and4.atlas",//119
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_1and4.atlas",//120
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3.atlas",//121
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3.atlas",//122
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3.atlas",//123
			"img/char/DCD_Animation/kuuga/titan/titan_FAR_2and3.atlas",//124
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R1.atlas",//125
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R2.atlas",//126
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R3.atlas",//127
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R4.atlas",//128
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R5.atlas",//129
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R6.atlas",//130
			"img/char/DCD_Animation/kuuga/FAR-R/Kuuga_FAR-R7.atlas",//131
			"img/char/DCD_Animation/kuuga/pegasus/pegasus_attack.atlas",//132
			"img/char/DCD_Animation/kuuga/pegasus/pegasus_attack2.atlas",//133
			"img/char/DCD_Animation/kuuga/pegasus/FAR-R/pegasus_far-r1.atlas",//134
			"img/char/DCD_Animation/kuuga/pegasus/FAR-R/pegasus_far-r2.atlas",//135
			"img/char/DCD_Animation/kuuga/pegasus/FAR-R/pegasus_far-r3.atlas",//136
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram1.atlas",//137
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram2.atlas",//138
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram3.atlas",//139
			"img/char/DCD_Animation/kuuga/gouram/gouram_attack.atlas",//140
			"img/char/DCD_Animation/kuuga/gouram/gouram_attack2.atlas",//141
			"img/char/DCD_Animation/kuuga/gouram/kuuga_gouram4.atlas",//142
			"img/char/DCD_Animation/kuuga/kuuga_tomighty.atlas"//143
    		};
	
	public static String [] NAME = {
			"",//0
			"normal",//1
			"henshin",//2
			"victory",//3
			"normal",//4
			"dcdtokuuga",//5
    		"backtodcd",//6
    		"Dragon",//7
    		"Pegasus",//8
    		"Titan",//9
    		"allformbacktodcd",//10
    		"backtodcd",//11
    		"dcdtoagito",//12
    		"flame",//13
    		"normal",//14
    		"storm",//15
    		"normal_p",//16
    		"normal_t",//17
    		"normal_tp",//18
    		"power_t",//19
    		"power",//20
    		"trinity",//21
    		"attack",//22
    		"backtodcd",//23
    		"defend",//24
    		"guard",//25
    		"guardattack",//26
    		"guardstrike",//27
    		"hensin",//28
    		"hensintonormal",//29
    		"normal",//30
    		"strike",//31
    		"strikeattack",//32
    		"FAR1",//33
    		"normal",//34
    		"hensin",//35
    		"FAR0",//36
    		"backtodcd",//37
    		"gunattack",//38
    		"henshin",//39
    		"normal",//40
    		"backtofaiz",//41
    		"Axel_attack",//42
    		"kamenride",//43
    		"timer",//44
    		"normal",//45
    		"normal",//46
    		"backtodcd",//47
    		"henshin",//48
    		"normal",//49
    		"backtodcd",//50
    		"prepare",//51
    		"prepare",//52
    		"stop",//53
    		"henshin",//54
    		"normal",//55
    		"attack",//56
    		"attack",//57
    		"attack",//58
    		"henshin",//59
    		"normal",//60
    		"normal",//61
    		"tokamenform",//62
    		"toriderform",//63
    		"backtodcd",//64
			"backtodcd",//65
			"normal",//66
			"henshin",//67
			"bokunitsuraretemiru",//68
			"kotaewa_kiite_nai",//69
			"nakerude",//70
			"FAR1",//71
			"FAR2",//72
			"FAR3",//73
			"kick",//74
			"FAR",//75
			"attack",//76
			"attacked",//77
			"attack",//78
			"shoot",//79
			"blast",//80
			"defend",//81
			"slash",//82
			"normal",//83
			"slash",//84
			"kuugatonormal",//85
			"attack",//86
			"defend",//87
			"attacked",//88
			"roll",//89
			"unarmed",//90
			"unarmed",//91
			"unarmed",//92
			"unarmed",//93
			"unarmed",//94
			"unarmed",//95
			"unarmed",//96
			"unarmed",//97
			"FAR1",//98
			"FAR2",//99
			"FAR3",//100
			"FAR4",//101
			"FAR5",//102
			"FAR6",//103
			"FAR7",//104
			"kamenride",//105
			"todragon",//106
			"totitan",//107
			"topegasus",//108
			"attack",//109
			"attack",//110
			"attack",//111
			"attack",//112
			"FAR1",//113
			"dash",//114
			"defend",//115
			"attack",//116
			"attack",//117
			"FAR1",//118
			"FAR4-1",//119
			"FAR4-2",//120
			"FAR2-1",//121
			"FAR2-2",//122
			"FAR3-1",//123
			"FAR3-2",//124
			"FAR1",//125
			"FAR2",//126
			"FAR3",//127
			"FAR4",//128
			"FAR5",//129
			"FAR6",//130
			"FAR7",//131
			"attack",//132
			"attack",//133
			"FAR1",//134
			"FAR2",//135
			"FAR3",//136
			"gouram",//137
			"gouram",//138
			"gouram",//139
			"attack",//140
			"attack",//141
			"gouram",//142
			"tomighty"//143
	};
    
}

