package com.wanzz.pgrcharwiki

object CharData {
    private val data = arrayOf(
        arrayOf(
            "Lucia: Plume",
            "Attacker",
            "Katana - Crimson Birch",
            "Gray Raven",
            "Babylonia developed this latest frame specifically for Lucia based on Gray Raven's experience and the data collected from Alpha.",
            "Physical (20%) Ice (80%)",
            R.drawable.plume_banner,
            R.drawable.plume_profile,
            R.drawable.faction_gr,
            R.drawable.class_attacker,
            "https://grayravens.com/wiki/Lucia:_Plume"
        ),
        arrayOf(
            "Lucia: Crimson Abyss",
            "Attcker",
            "Katana - Sakura",
            "Ascendant",
            "A mysterious enemy encountered by Gray Raven in City 015. Powerful yet mercurial.",
            "Physical (100%)",
            R.drawable.alpha_banner,
            R.drawable.alpha_profile,
            R.drawable.faction_ascendant,
            R.drawable.class_attacker,
            "https://grayravens.com/wiki/Lucia:_Crimson_Abyss"
        ),
        arrayOf(
            "Luna: Laurel",
            "Attacker",
            "Amplifier - Ozma",
            "Ascendant",
            "As an Agent of the Ascension-Network, this is her complete combat form, in which she can manipulate the Heteromer energy of the Punishing Virus and Constructs to deliver attacks with a power that transcends all Ascendants.",
            "Physical (10%) Dark (90%)",
            R.drawable.laurel_banner,
            R.drawable.profile_laurel,
            R.drawable.faction_ascendant,
            R.drawable.class_attacker,
            "https://grayravens.com/wiki/Luna:_Laurel"
        ),
        arrayOf(
            "Rosetta: Rigor",
            "Tank",
            "Spear Shield - Gungnir",
            "Arctic Route Union",
            "Leader of the original Forest Guard, Rosetta has been taken in by Babylonia, designated as a special unit, and redeployed onto the battlefield in a more humanoid form.",
            "Physical (100%)",
            R.drawable.rigor_banner,
            R.drawable.rigor_profile,
            R.drawable.faction_aru,
            R.drawable.class_tank,
            "https://grayravens.com/wiki/Rosetta:_Rigor"
        ),
        arrayOf(
            "Chrome: Glory",
            "Tank",
            "Gunblade - Apollo",
            "Strike Hawk",
            "The second specialized frame of Babylonia's mid-term military Construct development plan. It has been adjusted and optimized based on Chrome's request.",
            "Physical (20%) Ice (80%)",
            R.drawable.glory_banner,
            R.drawable.glory_profile,
            R.drawable.faction_sh,
            R.drawable.class_tank,
            "https://grayravens.com/wiki/Chrome:_Glory"
        ),
        arrayOf(
            "Vera: Garnet",
            "Tank",
            "Banner Spear - Phoenix",
            "Cerberus",
            "A frame Vera used in the past. Designed as an advanced, decisive countermeasure against hostile Constructs, it was finally introduced as an official unit not long ago. Its weapon is a specially forged banner spear.",
            "Physical (15%) Lightning (85%)",
            R.drawable.garnet_banner,
            R.drawable.garnet_profile,
            R.drawable.faction_cerberus,
            R.drawable.class_tank,
            "https://grayravens.com/wiki/Vera:_Garnet"
        ),
        arrayOf(
            "Liv: Empyrea",
            "Amplifier",
            "Scepter - Hestia",
            "Gray Raven",
            "A brand new specialized frame developed by the Science Council that is capable of \"purifying\" the Punishing Virus. To protect everything she loves, Liv has made her own choice.",
            "Physical (10%) Fire (90%)",
            R.drawable.empyrea_banner,
            R.drawable.empyrea_profile,
            R.drawable.faction_gr,
            R.drawable.class_amplifier,
            "https://grayravens.com/wiki/Liv:_Empyrea"
        ),
        arrayOf(
            "Selena: Capriccio",
            "Amplifier",
            "Flute Sword - Sarastro",
            "World Government Association of Art",
            "Selena's backup frame. Made with the support of an artist from WGAA, it is free-spirited and lively like its namesake, but the sentiments it embodies are earnest and solemn.",
            "Physical (10%) Dark (90%)",
            R.drawable.capriccio_banner,
            R.drawable.capriccio_profile,
            R.drawable.faction_wgaa,
            R.drawable.class_amplifier,
            "https://grayravens.com/wiki/Selena:_Capriccio"
        ),
        arrayOf(
            "Camu: Crocotta",
            "Vanguard",
            "Greatsword - Thanatos",
            "Strike Hawk",
            "A Transcendant that was once a repressed alter-ego in Kamui's M.I.N.D., Camu has been given his own unit by Babylonia, and now specializes in operations in and around heavily-Corrupted Dead Zones.",
            "Physical (20%) Dark (80%)",
            R.drawable.camu_banner,
            R.drawable.camu_profile,
            R.drawable.faction_sh,
            R.drawable.class_vanguard,
            "https://grayravens.com/wiki/Camu:_Crocotta"
        ),
        arrayOf(
            "Qu: Pavo",
            "Vanguard",
            "Glaive - Qinghe",
            "Kowloong Chamber of Commerce",
            "A Transcendant and the last head of Kowloong. After the Battle of Kowloong, she has gone into hiding and continued with her ambition to achieve the Tabula Akasha.",
            "Physical (100%)",
            R.drawable.pavo_banner,
            R.drawable.pavo_profile,
            R.drawable.faction_kcc,
            R.drawable.class_vanguard,
            "https://grayravens.com/wiki/Qu:_Pavo"
        ),
        arrayOf(
            "Pulao: Dragontoll",
            "Vanguard",
            "Dragon Maelstrom - Infinity",
            "Kowloong Chamber of Commerce",
            "The frame of Pulao, one of the Dragon Children, is not made from conventional components but has been carefully adapted to fit her M.I.N.D., allowing her to make the most of her unusually strong powers.",
            "Physical (100%)",
            R.drawable.pulao_banner,
            R.drawable.pulao_profile,
            R.drawable.faction_kcc,
            R.drawable.class_vanguard,
            "https://grayravens.com/wiki/Pulao:_Dragontoll"
        )
    )

    val listData: ArrayList<CharModel>
        get() {
            val list = ArrayList<CharModel>()
            for (item in data) {
                val itemData = CharModel()
                itemData.name = item[0].toString()
                itemData.role = item[1].toString()
                itemData.weapon = item[2].toString()
                itemData.faction = item[3].toString()
                itemData.info = item[4].toString()
                itemData.element = item[5].toString()
                itemData.banner = item[6] as Int
                itemData.profile = item[7] as Int
                itemData.imgFaction = item[8] as Int
                itemData.imgRole = item[9] as Int
                itemData.link = item[10].toString()

                list.add(itemData)
            }
            return list
        }
}