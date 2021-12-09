package com.moon.runwords.data

import com.moon.runwords.R

object DataProvider {
    val tipList = listOf(
        Tip(
            id = 1,
            title = "시세",
            url = "http://jahber.net"
        ),
        Tip(
            id = 2,
            title = "아이템",
            url = "https://bit.ly/3nbwGZb"
        ),
        Tip(
            id = 3,
            title = "버스노선",
            url = "https://m.inven.co.kr/webzine/wznews.php?site=diablo2&iskin=diablo2&idx=263097"
        ),
        Tip(
            id = 4,
            title = "초보팁",
            url = "https://m.cafe.daum.net/humornara/5Y2/743616?q=%EB%AA%A8%EB%82%98%ED%81%AC%20%EB%94%94%EC%95%842&"
        ),
        Tip(
            id = 5,
            title = "앵벌",
            url = "https://m.dcinside.com/board/diablo2resurrected/13439"
        ),
        Tip(
            id = 6,
            title = "공략",
            url = "https://heumu.blogspot.com/2020/01/2_8.html"
        ),
        Tip(
            id = 7,
            title = "길찾기",
            url = "https://m.inven.co.kr/board/diablo2/5734/89"
        )
    )

    val runList = listOf(
        Rune(
            id = 1,
            title = "엘",
            runeImageId = R.drawable.r1
        ),
        Rune(
            id = 2,
            title = "엘드",
            runeImageId = R.drawable.r2
        ),
        Rune(
            id = 3,
            title = "티르",
            runeImageId = R.drawable.r3
        ),
        Rune(
            id = 4,
            title = "네프",
            runeImageId = R.drawable.r4
        ),
        Rune(
            id = 5,
            title = "에드",
            runeImageId = R.drawable.r5
        ),
        Rune(
            id = 6,
            title = "아이드",
            runeImageId = R.drawable.r6
        ),
        Rune(
            id = 7,
            title = "탈",
            runeImageId = R.drawable.r7
        ),
        Rune(
            id = 8,
            title = "랄",
            runeImageId = R.drawable.r8
        ),
        Rune(
            id = 9,
            title = "오르트",
            runeImageId = R.drawable.r9
        ),
        Rune(
            id = 10,
            title = "주울",
            runeImageId = R.drawable.r10
        ),
        Rune(
            id = 11,
            title = "앰",
            runeImageId = R.drawable.r11
        ),
        Rune(
            id = 12,
            title = "솔",
            runeImageId = R.drawable.r12
        ),
        Rune(
            id = 13,
            title = "샤에",
            runeImageId = R.drawable.r13
        ), Rune(
            id = 14,
            title = "돌",
            runeImageId = R.drawable.r14
        ),
        Rune(
            id = 15,
            title = "헬",
            runeImageId = R.drawable.r15
        ),
        Rune(
            id = 16,
            title = "포",
            runeImageId = R.drawable.r16
        ),
        Rune(
            id = 17,
            title = "룸",
            runeImageId = R.drawable.r17
        ),
        Rune(
            id = 18,
            title = "코",
            runeImageId = R.drawable.r18
        ),
        Rune(
            id = 19,
            title = "팔",
            runeImageId = R.drawable.r19
        ),
        Rune(
            id = 20,
            title = "렘",
            runeImageId = R.drawable.r20
        ),
        Rune(
            id = 21,
            title = "풀",
            runeImageId = R.drawable.r21
        ),
        Rune(
            id = 22,
            title = "우움",
            runeImageId = R.drawable.r22
        ),
        Rune(
            id = 23,
            title = "말",
            runeImageId = R.drawable.r23
        ),
        Rune(
            id = 24,
            title = "이스트",
            runeImageId = R.drawable.r24
        ), Rune(
            id = 25,
            title = "굴",
            runeImageId = R.drawable.r25
        ),
        Rune(
            id = 26,
            title = "벡스",
            runeImageId = R.drawable.r26
        ),
        Rune(
            id = 27,
            title = "오옴",
            runeImageId = R.drawable.r27
        ),
        Rune(
            id = 28,
            title = "로",
            runeImageId = R.drawable.r28
        ),
        Rune(
            id = 29,
            title = "수르",
            runeImageId = R.drawable.r29
        ),
        Rune(
            id = 30,
            title = "베르",
            runeImageId = R.drawable.r30
        ),
        Rune(
            id = 31,
            title = "조",
            runeImageId = R.drawable.r31
        ),
        Rune(
            id = 32,
            title = "참",
            runeImageId = R.drawable.r32
        ),
        Rune(
            id = 33,
            title = "조드",
            runeImageId = R.drawable.r33
        )
    )
    val runeWordList = listOf(
        RuneWord(
            id = 1,
            title = "바람, 윈드 (Wind)",
            socket = "근접 무기 (2소켓)",
            combinationRune = arrayListOf(29, 1),
            options = "10% 기회로 레벨 9 토네이도 시전 (타격시)\n" +
                    "+20% 매우 빠른 달리기/걷기 속도 증가\n" +
                    "+40% 공격속도 증가\n" +
                    "+15% 매우 빠른 회복속도 증가\n" +
                    "+120~160% 증가된 데미지 (변함)\n" +
                    "-50% 목표물의 방어\n" +
                    "+50 공격등급\n" +
                    "목표물의 시야 감소(명중시)\n" +
                    "+1 시야 증가\n" +
                    "레벨 13 트위스터 (127회)"
        ),
        RuneWord(
            id = 2,
            title = "강철, 스틸 (Steel)",
            socket = "검, 도끼, 메이스 (2소켓)",
            combinationRune = arrayListOf(3, 1),
            options = "+25% 공격속도 증가\n" +
                    "+20% 증가된 데미지\n" +
                    "+3 최소 데미지\n" +
                    "+3 최대 데미지\n" +
                    "+50 공격등급\n" +
                    "50% 상처 악화\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "+1 시야 증가"
        ),
        RuneWord(
            id = 3,
            title = "악의, 원환 (Malice)",
            socket = "근접 무기 (3소켓)",
            combinationRune = arrayListOf(6, 1, 5),
            options = "+33% 증가된 데미지\n" +
                    "+9 최대 데미지\n" +
                    "100% 상처 악화 (Open Wounds)\n" +
                    "-25% 목표물의 방어\n" +
                    "-100 몬스터의 방어 감소 (명중시)\n" +
                    "몬스터 회복 저지\n" +
                    "+50 공격 등급\n" +
                    "라이프 흡수 -5"
        ),
        RuneWord(
            id = 4,
            title = "죽어가는 자의 숨결, 죽음의 숨결 (Breath of the Dying)",
            socket = "무기 (6소켓)",
            combinationRune = arrayListOf(26, 15, 1, 2, 33, 5),
            options = "50% 기회로 레벨 20 포이즌 노바 시전 (당신이 적을 죽인 경우)\n" +
                    "(파괴안됨)\n" +
                    "+60% 공격속도 증가\n" +
                    "+350~400% 증가된 데미지 (변함)\n" +
                    "-25% 목표물의 방어\n" +
                    "+50 공격등급\n" +
                    "+200% 언데드에게 주는 데미지 상승\n" +
                    "+50 언데드에 대한 공격등급 상승\n" +
                    "7% 마나 획득(공격 명중시)\n" +
                    "12~15% 라이프 획득(공격 명중시) (변함)\n" +
                    "몬스터 회복 저지\n" +
                    "+30 모든 능력치\n" +
                    "+1 시야 증가\n" +
                    "착용 가능 요구치 -20%"
        ),
        RuneWord(
            id = 5,
            title = "인내 (Fortitude)",
            socket = "무기, 갑옷 (갑옷) (4소켓)",
            combinationRune = arrayListOf(1, 12, 14, 28),
            options = "20% 기회로 레벨 15 칠링 아머 시전 (반격시)\n" +
                    "+25% 매우 빠른 캐스팅 속도 증가\n" +
                    "+300% 증가된 데미지\n" +
                    "+200% 방어 상승\n" +
                    "+15 방어\n" +
                    "+(1~1.5)~(99~148.5) 라이프 (캐릭터 레벨에 비례해서)\n" +
                    "라이프 회복 +7\n" +
                    "+5% 최대 라이트닝 저항력\n" +
                    "모든 저항력 +25~30 (변함)\n" +
                    "데미지 감소 7\n" +
                    "12% 데미지 마나로 흡수\n" +
                    "+1 시야 증가"
        ),
        RuneWord(
            id = 6,
            title = "죽음 (Death)",
            socket = "검, 도끼 (5소켓)",
            combinationRune = arrayListOf(15, 1, 26, 9, 25),
            options = "100% 기회로 레벨 44 체인 라이트닝 시전 (당신이 죽은 경우)\n" +
                    "25% 기회로 레벨 18 글래셜 스파이크 시전 (공격시)\n" +
                    "(파괴불가)\n" +
                    "+300~385% 증가된 데미지 (변함)\n" +
                    "20% 공격등급 상승\n" +
                    "+50 공격등급 상승\n" +
                    "1~50 라이트닝 데미지 추가\n" +
                    "7% 마나 획득(공격 명중시)\n" +
                    "50% 강한 타격 확률\n" +
                    "(캐릭터 레벨당 0.5) 0.5~49.5% 치명적 공격 (캐릭터 레벨에\n" +
                    "비례해서)\n" +
                    "+1 시야 증가\n" +
                    "레벨 22 블러드 골렘(15 회)\n" +
                    "착용 가능 요구치 -20%"
        ),
        RuneWord(
            id = 7,
            title = "이유있는 항변 (Voice of Reason)",
            socket = "검, 메이스 (4소켓)",
            combinationRune = arrayListOf(20, 18, 1, 2),
            options = "15% 기회로 레벨 13 프로즌 오브 시전 (타격시)\n" +
                    "18% 기회로 레벨 20 아이스 블래스트 시전 (타격시)\n" +
                    "+50 공격등급\n" +
                    "+220~350% 데몬에게 주는 데미지 상승 (변함)\n" +
                    "+355~375% 언데드에게 주는 데미지 상승 (변함)\n" +
                    "+50 언데드에 대한 공격등급 상승\n" +
                    "100~220 콜드 데미지 추가\n" +
                    "-24% 적의 콜드 레지스트에 대하여\n" +
                    "+10 민첩성\n" +
                    "결빙되지 않음\n" +
                    "75% 몬스터로부터 얻는 골드 증가\n" +
                    "+1 시야 증가"
        ),
        RuneWord(
            id = 8,
            title = "명예 (Honor)",
            socket = "근접무기 (5소켓)",
            combinationRune = arrayListOf(11, 1, 6, 3, 12),
            options = "+1 모든 스킬 상승\n" +
                    "+160% 증가된 데미지\n" +
                    "+9 최소 데미지\n" +
                    "+9 최대 데미지\n" +
                    "25% 치명적 공격\n" +
                    "+250 공격 등급\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "+10 힘\n" +
                    "라이프 회복 +10\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "+1 시야 증가"
        ),
        RuneWord(
            id = 9,
            title = "원칙 (Principle)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(8, 25, 2),
            options = "100% 기회로 레벨 5 홀리 볼트 시전 (타격시)\n" +
                    "+2 모든 팔라딘 스킬 레벨 상승\n" +
                    "+50% 언데드에게 주는 데미지 상승\n" +
                    "+100~150 라이프 (변함)\n" +
                    "15% 스태미나 소모 지연\n" +
                    "+5% 최대 포이즌 저항력\n" +
                    "파이어 저항력 +30%"
        ),
        RuneWord(
            id = 10,
            title = "침묵 (Slience)",
            socket = "무기 (6소켓)",
            combinationRune = arrayListOf(14, 2, 15, 24, 3, 26),
            options = "+2 모든 스킬 상승\n" +
                    "+20% 공격속도 증가\n" +
                    "+20% 매우 빠른 회복속도 증가\n" +
                    "+200% 증가된 데미지\n" +
                    "+75% 언데드에게 주는 데미지 상승\n" +
                    "+50 언데드에 대한 공격등급 상승\n" +
                    "11% 마나 획득(공격 명중시)\n" +
                    "목표물의 시야 감소(명중시) +33\n" +
                    "몬스터가 달아남(명중시) 25%\n" +
                    "모든 저항력 +75\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "30% 매직 아이템 얻을 확률 증가\n" +
                    "착용 가능 요구치 -20%"
        ),
        RuneWord(
            id = 11,
            title = "신념, 신뢰 (Faith)",
            socket = "보우, 크로스보우 (4소켓)",
            combinationRune = arrayListOf(27, 31, 20, 2),
            options = "장착시 12~15레벨의 파나티시즘 오라의 효과 적용 (변\n" +
                    "함)\n" +
                    "+1~2 모든 스킬 상승 (변함)\n" +
                    "+330% 증가된 데미지\n" +
                    "목표물의 방어력 무시\n" +
                    "300% 공격등급 추가 상승\n" +
                    "+75% 언데드에게 주는 데미지 상승\n" +
                    "+50 언데드에 대한 공격등급 상승\n" +
                    "+120 파이어 데미지\n" +
                    "모든 저항력 +15\n" +
                    "10% 소생시키다: 리턴드\n" +
                    "75% 몬스터로부터 얻는 골드 증가"
        ),
        RuneWord(
            id = 12,
            title = "열정 (Passion)",
            socket = "무기 (4소켓)",
            combinationRune = arrayListOf(14, 9, 2, 20),
            options = "+25% 공격속도 증가\n" +
                    "+160~210% 증가된 데미지 (변함)\n" +
                    "50~80% 공격등급 추가 상승 (변함)\n" +
                    "+75% 언데드에게 주는 데미지 상승\n" +
                    "+50 언데드에 대한 공격등급 상승\n" +
                    "1~50 라이트닝 데미지 추가\n" +
                    "+1 버서크\n" +
                    "+1 질\n" +
                    "목표물의 시야 감소(명중시) +10\n" +
                    "몬스터가 달아남(명중시) 25%\n" +
                    "75% 몬스터로부터 얻는 골드 증가\n" +
                    "레벨 3 하트 오브 울버린 (12회)"
        ),
        RuneWord(
            id = 13,
            title = "신중, 현명 (Prudence)",
            socket = "갑옷 (2소켓)",
            combinationRune = arrayListOf(23, 3),
            options = "+25% 매우 빠른 회복속도 증가\n" +
                    "+140~170% 방어 상승 (변함)\n" +
                    "모든 저항력 +25~35 (변함)\n" +
                    "데미지 감소 3\n" +
                    "마법 데미지 감소 17\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "+1 시야 증가\n" +
                    "내구력 1 회복 (매 4초당)"
        ),
        RuneWord(
            id = 14,
            title = "강함, 스트렝쓰 (Strength)",
            socket = "근접 무기 (2소켓)",
            combinationRune = arrayListOf(11, 3),
            options = "+35% 증가된 데미지\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "25% 강한 타격 확률\n" +
                    "+20 힘\n" +
                    "+10 생명력\n" +
                    "+2 마나 상승(적 제거시)"
        ),
        RuneWord(
            id = 15,
            title = "구렁텅이, 천저 (Nadir)",
            socket = "투구 (2소켓)",
            combinationRune = arrayListOf(4, 3),
            options = "+50% 방어 상승\n" +
                    "+10 방어\n" +
                    "+30 원거리 공격 방어\n" +
                    "+5 힘\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "-33% 몬스터로부터 얻는 골드 증가\n" +
                    "-3 시야 증가\n" +
                    "레벨 13 클럭 오브 쉐도우 (9회)"
        ),
        RuneWord(
            id = 16,
            title = "잎새, 꽃잎 (Leaf)",
            socket = "지팡이 (오브 제외) (2소켓)",
            combinationRune = arrayListOf(3, 8),
            options = "+3 파이어 스킬 상승\n" +
                    "5~30 파이어 데미지 추가\n" +
                    "+3 인페르노 (소서리스 전용)\n" +
                    "+3 웜쓰 (소서리스 전용)\n" +
                    "+3 파이어 볼트 (소서리스 전용)\n" +
                    "+(캐릭터 레벨당 2) 2~198 방어 (캐릭터 레벨에 비례해서)\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "콜드 저항력 +33%"
        ),
        RuneWord(
            id = 17,
            title = "모서리 (Edge)",
            socket = "보우, 크로스보우 (3소켓)",
            combinationRune = arrayListOf(3, 7, 11),
            options = "장착시 15레벨의 쏜즈 오라의 효과 적용\n" +
                    "+35% 공격속도 증가\n" +
                    "+320~380% 데몬에게 주는 데미지 상승 (변함)\n" +
                    "+280% 언데드에게 주는 데미지 상승\n" +
                    "매초당 +75 포이즌 데미지 추가\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "몬스터 회복 저지\n" +
                    "+5~10 모든 능력치 (변함)\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "상점에서 파는 모든 물품의 가격 하락 15%"
        ),
        RuneWord(
            id = 18,
            title = "초승달 (Cresent Moon)",
            socket = "도끼, 검, 폴암 (3소켓)",
            combinationRune = arrayListOf(13, 22, 3),
            options = "10% 기회로 레벨 17 체인 라이트닝 시전 (타격시)\n" +
                    "7% 기회로 레벨 13 스태틱 필드 시전 (타격시)\n" +
                    "+20% 공격속도 증가\n" +
                    "+180~220% 증가된 데미지 (변함)\n" +
                    "목표물의 방어력 무시\n" +
                    "-35% 적의 라이트닝 레지스트에 대하여\n" +
                    "25% 상처 악화\n" +
                    "+9~11 매직 흡수 (변함)\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "레벨 18 스피리트 울프 (30회)"
        ),
        RuneWord(
            id = 19,
            title = "부, 웰쓰 (Wealth)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(20, 18, 3),
            options = "+10 민첩성\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "300% 몬스터로부터 얻는 골드 증가\n" +
                    "100% 매직아이템 얻을 확률 증가"
        ),
        RuneWord(
            id = 20,
            title = "통찰력 (Insight)",
            socket = "폴암, 지팡이 (4소켓)",
            combinationRune = arrayListOf(8, 3, 7, 12),
            options = "장착시 12~17레벨의 메디테이션 오라의 효과 적용 (변함)\n" +
                    "+35% 매우 빠른 캐스팅 속도 증가\n" +
                    "+200~260% 증가된 데미지 (변함)\n" +
                    "+9 최소 데미지\n" +
                    "180~250% 공격등급 추가 상승 (변함)\n" +
                    "5~30 파이어 데미지 추가\n" +
                    "매초당 +75 포이즌 데미지 추가\n" +
                    "+1~6 크리티컬 스트라이크 (변함)\n" +
                    "+5 모든 능력치\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "23% 매직 아이템 얻을 확률 증가"
        ),
        RuneWord(
            id = 21,
            title = "조화 (Harmony)",
            socket = "보우, 크로스보우 (4소켓)",
            combinationRune = arrayListOf(3, 6, 12, 18),
            options = "장착시 10레벨의 비거 오라의 효과 적용\n" +
                    "+200~275% 증가된 데미지 (변함)\n" +
                    "+9 최소 데미지\n" +
                    "+9 최대 데미지\n" +
                    "55~160 파이어 데미지 추가\n" +
                    "55~160 라이트닝 데미지 추가\n" +
                    "55~160 콜드 데미지 추가\n" +
                    "+2~6 발키리 (변함)\n" +
                    "+10 민첩성\n" +
                    "마나 재생 20%\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "+2 시야 증가\n" +
                    "레벨 20 리바이브 (25회)"
        ),
        RuneWord(
            id = 22,
            title = "슬픔, 깊은 고뇌 (Grief)",
            socket = "검, 도끼 (5소켓)",
            combinationRune = arrayListOf(5, 3, 28, 23, 8),
            options = "35% 기회로 레벨 15 베넘 시전 (타격시)\n" +
                    "+30~40% 공격속도 증가 (변함)\n" +
                    "데미지 +340~400 (변함)\n" +
                    "목표물의 방어력 무시\n" +
                    "-25% 목표물의 방어\n" +
                    "+(캐릭터 레벨당 1.875) 1.875~185.625% 데몬에게 주는 데미지 상승 (캐릭터 레벨에 비례해서)\n" +
                    "5~30 파이어 데미지 추가\n" +
                    "-(20~25)% 적의 포이즌 레지스트에 대하여 (변함)\n" +
                    "20% 치명적 공격\n" +
                    "몬스터의 회복 저지\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "+10~15 몬스터를 죽일 때마다 라이프를 얻음 (변함)"
        ),
        RuneWord(
            id = 23,
            title = "야수 (Beast)",
            socket = "도끼, 셉터, 해머 (5소켓)",
            combinationRune = arrayListOf(30, 3, 22, 23, 17),
            options = "장착시 9레벨의 파나티시즘 오라의 효과 적용\n" +
                    "+40% 공격속도 증가\n" +
                    "+240~270% 증가된 데미지 (변함)\n" +
                    "20% 강한 타격 확률\n" +
                    "25% 상처 악화\n" +
                    "+3 워베어\n" +
                    "+3 변신술\n" +
                    "몬스터 회복 저지\n" +
                    "+25~40 힘 (변함)\n" +
                    "+10 에너지\n" +
                    "+2 마나 상승 (적 제거시)\n" +
                    "레벨 13 그리즐리 (5회)"
        ),
        RuneWord(
            id = 24,
            title = "연기 (Smoke)",
            socket = "갑옷 (2소켓)",
            combinationRune = arrayListOf(4, 17),
            options = "+20% 매우 빠른 회복속도 증가\n" +
                    "+75% 방어 상승\n" +
                    "+280 원거리 공격 방어\n" +
                    "+10 에너지\n" +
                    "모든 저항력 +50\n" +
                    "-1 시야 증가\n" +
                    "레벨 6 위큰 (18회)"
        ),
        RuneWord(
            id = 25,
            title = "신화 (Myth)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(15, 11, 4),
            options = "3% 기회로 레벨 1 하울 시전 (반격시)\n" +
                    "10% 기회로 레벨 1 타운트 시전 (타격시)\n" +
                    "+2 모든 바바리안 스킬 레벨 상승\n" +
                    "+30 원거리 공격 방어\n" +
                    "라이프 회복 +10\n" +
                    "공격자가 받는 데미지 14\n" +
                    "착용 가능 요구치 -15%"
        ),
        RuneWord(
            id = 26,
            title = "광휘, 찬란한 빛 (Radiance)",
            socket = "투구 (3소켓)",
            combinationRune = arrayListOf(4, 12, 6),
            options = "+75% 방어 상승\n" +
                    "+30 원거리 공격 방어\n" +
                    "+10 생명력\n" +
                    "+10 에너지\n" +
                    "+33 마나\n" +
                    "데미지 감소 7\n" +
                    "마법 데미지 감소 3\n" +
                    "15% 데미지 마나로 흡수\n" +
                    "+5 시야 증가"
        ),
        RuneWord(
            id = 27,
            title = "선율, 멜로디 (Melody)",
            socket = "보우, 크로스보우 (3소켓)",
            combinationRune = arrayListOf(13, 18, 4),
            options = "+3 보우 & 크로스보우 스킬 (아마존 전용)\n" +
                    "+20% 공격속도 증가\n" +
                    "+50% 증가된 데미지\n" +
                    "+300% 언데드에게 주는 데미지 상승\n" +
                    "+3 슬로우 미사일 (아마존 전용)\n" +
                    "+3 닷지 (아마존 전용)\n" +
                    "+3 크리티컬 스트라이크 (아마존 전용)\n" +
                    "적을 밀쳐냄\n" +
                    "+10 민첩성"
        ),
        RuneWord(
            id = 28,
            title = "어둠 블랙 (Black)",
            socket = "클럽, 해머, 메이스 (3소켓)",
            combinationRune = arrayListOf(10, 16, 4),
            options = "+15% 공격속도 증가\n" +
                    "+120% 증가된 데미지\n" +
                    "+200 공격등급\n" +
                    "3~14 콜드 데미지 추가\n" +
                    "40% 강한 타격 확률\n" +
                    "적을 밀쳐냄\n" +
                    "+10 생명력\n" +
                    "마법 데미지 감소 2\n" +
                    "레벨 4 커프스 익스플로젼 (12회)"
        ),
        RuneWord(
            id = 29,
            title = "광채, 스플렌더 (Splendor)",
            socket = "방패 (2소켓)",
            combinationRune = arrayListOf(5, 17),
            options = "+1 모든 스킬 상승\n" +
                    "+10% 매우 빠른 캐스팅 속도 증가\n" +
                    "+20% 매우 빠른 방어속도 증가\n" +
                    "+60~100% 방어 상승 (변함)\n" +
                    "+10 에너지\n" +
                    "마나 재생 15%\n" +
                    "50% 몬스터로부터 얻는 골드 증가\n" +
                    "20% 매직아이템 얻을 확률 증가\n" +
                    "+3 시야 증가"
        ),
        RuneWord(
            id = 30,
            title = "서풍, 제퍼 (Zephyr)",
            socket = "보우, 크로스보우 (2소켓)",
            combinationRune = arrayListOf(9, 5),
            options = "7% 기회로 레벨 1 트위스터 시전 (반격시)\n" +
                    "+25% 매우 빠른 달리기/걷기 속도 증가\n" +
                    "+25% 공격속도 증가\n" +
                    "+33% 증가된 데미지\n" +
                    "-25% 목표물의 방어\n" +
                    "+66 공격등급\n" +
                    "1~50 라이트닝 데미지 추가\n" +
                    "+25 방어"
        ),
        RuneWord(
            id = 31,
            title = "잠행, 스텔스 (Stealth)",
            socket = "갑옷 (2소켓)",
            combinationRune = arrayListOf(7, 5),
            options = "+25% 매우 빠른 달리기/걷기 속도 증가\n" +
                    "+25% 매우 빠른 캐스팅 속도 증가\n" +
                    "+25% 매우 빠른 회복속도 증가\n" +
                    "+6 민첩성\n" +
                    "마나 재생 15%\n" +
                    "+15 스태미나 최대치\n" +
                    "포이즌 저항력 +30%\n" +
                    "마법 데미지 감소 3"
        ),
        RuneWord(
            id = 32,
            title = "각운, 제왕운시 (Rhyme)",
            socket = "방패 (2소켓)",
            combinationRune = arrayListOf(13, 5),
            options = "+40% 매우 빠른 방어속도 증가\n" +
                    "20% 공격저지 성공율 증가\n" +
                    "마나 재생 15%\n" +
                    "모든 저항력 +25\n" +
                    "결빙되지 않음\n" +
                    "50% 몬스터로부터 얻는 골드 증가\n" +
                    "25% 매직 아이템 얻을 확률 증가"
        ),
        RuneWord(
            id = 33,
            title = "분노, 원한 (Fury)",
            socket = "근접 무기 (3소켓)",
            combinationRune = arrayListOf(31, 23, 5),
            options = "+40% 공격속도 증가\n" +
                    "+209% 증가된 데미지\n" +
                    "목표물의 방어력 무시\n" +
                    "-25% 목표물의 방어\n" +
                    "20% 공격등급 추가 상승\n" +
                    "6% 라이프 획득(공격 명중시)\n" +
                    "33% 치명적 공격\n" +
                    "66% 상처 악화\n" +
                    "+5 프렌지 (바바리안 전용\n" +
                    "몬스터 회복 저지"
        ),
        RuneWord(
            id = 34,
            title = "순종 (Obedience)",
            socket = "폴암 (5소켓) 래더전용",
            combinationRune = arrayListOf(15, 18, 10, 5, 19),
            options = "30% 기회로 레벨 21 인첸트 시전 (당신이 적을 죽인 경우)\n" +
                    "+40% 매우 빠른 회복속도 증가\n" +
                    "+370% 증가된 데미지\n" +
                    "-25% 목표물의 방어\n" +
                    "3~14 콜드 데미지 추가\n" +
                    "-25% 적의 파이어 레지스트에 대하여\n" +
                    "40% 강한 타격 확률\n" +
                    "+200~300 방어 (변함)\n" +
                    "+10 힘\n" +
                    "+10 민첩성\n" +
                    "모든 저항력 +20~30 (변함)\n" +
                    "착용 가능 요구치 -20%\n"
        ),
        RuneWord(
            id = 35,
            title = "찔레, 검은 딸기 (Bramble)",
            socket = "갑옷 (4소켓)",
            combinationRune = arrayListOf(8, 27, 29, 5),
            options = "착용시 15~21레벨의 쏜즈 오라의 효과 적용 (변함)\n" +
                    "+50% 매우 빠른 회복속도 증가\n" +
                    "+25~50% 포이즌 스킬 데미지에 대하여 (변함)\n" +
                    "+300 방어\n" +
                    "최대 마나 증가 5%\n" +
                    "마나 재생 15%\n" +
                    "+5% 최대 콜드 저항력\n" +
                    "파이어 저항력 +30%\n" +
                    "포이즌 저항력 +100%\n" +
                    "+13 몬스터를 죽일 때마다 라이프를 얻음\n" +
                    "레벨 13 스피리트 오브 바브 (33회)"
        ),
        RuneWord(
            id = 36,
            title = "기억 (Memory)",
            socket = "지팡이 (오브 제외) (4소켓)",
            combinationRune = arrayListOf(17, 16, 12, 5),
            options = "+3 모든 소서리스 스킬 레벨 상승\n" +
                    "+33% 매우 빠른 캐스팅 속도 증가\n" +
                    "+9 최소 데미지\n" +
                    "+3 에너지 쉴드 (소서리스 전용)\n" +
                    "+2 스태틱 필드 (소서리스 전용)\n" +
                    "+50% 방어 상승\n" +
                    "+10 생명력\n" +
                    "+10 에너지\n" +
                    "최대 마나 증가 20%\n" +
                    "마법 데미지 감소 7\n" +
                    "-25% 목표물의 방어"
        ),
        RuneWord(
            id = 37,
            title = "신성한 번개 (Holy Thunder)",
            socket = "셉터 (4소켓)",
            combinationRune = arrayListOf(5, 8, 9, 7),
            options = "+60% 증가된 데미지\n" +
                    "+10 최대 데미지\n" +
                    "-25% 목표물의 방어\n" +
                    "5~30 파이어 데미지 추가\n" +
                    "21~110 라이트닝 데미지 추가\n" +
                    "매초당 +75 포이즌 데미지 추가\n" +
                    "+3 홀리 쇼크 (팔라딘 전용)\n" +
                    "+5% 최대 라이트닝 저항력\n" +
                    "라이트닝 저항력 +60%\n" +
                    "레벨 7 체인 라이트닝 (60회)"
        ),
        RuneWord(
            id = 38,
            title = "비 (Rain)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(9, 23, 6),
            options = "5% 기회로 레벨 15 사이클론 아머 시전 (반격시)\n" +
                    "5% 기회로 레벨 15 트위스터 시전 (타격시)\n" +
                    "+2 드루이드 스킬\n" +
                    "+100~150 마나 (변함)\n" +
                    "라이트닝 저항력 +30%\n" +
                    "마법 데미지 감소 7\n" +
                    "15% 데미지 마나로 흡수"
        ),
        RuneWord(
            id = 39,
            title = "수수께끼 (enigma)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(31, 6, 30),
            options = "+2 모든 스킬 상승\n" +
                    "+45% 매우 빠른 달리기/걷기 속도 증가\n" +
                    "+1 텔레포트\n" +
                    "+750~775 방어 (변함)\n" +
                    "+(캐릭터 레벨당 0.75) 0~74 힘 (캐릭터 레벨에 비례해서)\n" +
                    "최대 라이프 증가 5%\n" +
                    "데미지 감소 8%\n" +
                    "+14 몬스터를 죽일 때마다 라이프를 얻음\n" +
                    "15% 데미지 마나로 흡수\n" +
                    "(캐릭터 레벨당 1) 1~99% 매직 아이템 얻을 확률 증가 (캐릭터 레벨에 비례해서)"
        ),
        RuneWord(
            id = 40,
            title = "맹독, 베놈 (Venom)",
            socket = "무기 (3소켓)",
            combinationRune = arrayListOf(7, 14, 23),
            options = "목표물의 방어력 무시\n" +
                    "매 초당 +273 포이즌 대미지 추가\n" +
                    "7% 마나 획득(공격 명중 시)\n" +
                    "몬스터 회복 저지\n" +
                    "몬스터가 달아남(명중 시) 25%\n" +
                    "레벨 13 포이즌 노바 (11회)\n" +
                    "레벨 15 포이즌 익스플로전 (27회)"
        ),
        RuneWord(
            id = 41,
            title = "고대인의 서약 (Ancient's Pledge)",
            socket = "방패 (3소켓)",
            combinationRune = arrayListOf(8, 9, 7),
            options = "+50%방어 상승\n" +
                    "콜드 저항력 +43%\n" +
                    "라이트닝 저항력 +48%\n" +
                    "파이어 저항력 +48%\n" +
                    "포이즌 저항력 +48%\n" +
                    "10% 데미지 마나로 흡수"
        ),
        RuneWord(
            id = 42,
            title = "깨우침, 계몽, 교화 (Enlightenment)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(21, 8, 12),
            options = "5% 기회로 레벨 15 블레이즈 시전 (반격시)\n" +
                    "5% 기회로 레벨 15 파이어 볼 시전 (타격시)\n" +
                    "+2 모든 소서리스 스킬 레벨 상승\n" +
                    "+1 웜쓰\n" +
                    "+30% 방어 상승\n" +
                    "파이어 저항력 +30%\n" +
                    "데미지 감소 7"
        ),
        RuneWord(
            id = 43,
            title = "왕의 은총, 자비 (King's Grace)",
            socket = "검, 셉터 (3소켓)",
            combinationRune = arrayListOf(11, 8, 10),
            options = "+100% 증가된 데미지\n" +
                    "+150 공격등급\n" +
                    "+100% 데몬에게 주는 데미지 상승\n" +
                    "+100 데몬에 대한 공격등급 상승\n" +
                    "+50% 언데드에게 주는 데미지 상승\n" +
                    "+100 언데드에 대한 공격등급 상승\n" +
                    "5~30 파이어 데미지 추가\n" +
                    "3~14 콜드 데미지 추가\n" +
                    "7% 라이프 획득(공격 명중시)"
        ),
        RuneWord(
            id = 44,
            title = "콜투암스, 소집 (Call To Arms)",
            socket = "무기 (5소켓)",
            combinationRune = arrayListOf(11, 8, 23, 24, 27),
            options = "+1 모든 스킬 상승\n" +
                    "+40% 공격속도 증가\n" +
                    "+250~290% 증가된 데미지 (변함)\n" +
                    "5~30 파이어 데미지 추가\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "+2~6 배틀 커맨드 (변함)\n" +
                    "+1~6 배틀 오더스 (변함)\n" +
                    "+1~4 배틀 크라이 (변함)\n" +
                    "몬스터 회복 저지\n" +
                    "라이프 회복 +12\n" +
                    "30% 매직 아이템 얻을 확률 증가"
        ),
        RuneWord(
            id = 45,
            title = "전승, 학식 (Lore)",
            socket = "투구 (2소켓)",
            combinationRune = arrayListOf(9, 12),
            options = "+1 모든 스킬 상승\n" +
                    "+10 에너지\n" +
                    "라이트닝 저항력 +30%\n" +
                    "데미지 감소 7\n" +
                    "+2 마나 상승(적 제거시)\n" +
                    "+2 시야 증가"
        ),
        RuneWord(
            id = 46,
            title = "기근 (Famine)",
            socket = "도끼, 해머 (4소켓)",
            combinationRune = arrayListOf(19, 27, 9, 31),
            options = "+30% 공격속도 증가\n" +
                    "+320~370% 증가된 데미지 (변함)\n" +
                    "목표물의 방어력 무시\n" +
                    "180~200 매직 데미지 추가\n" +
                    "50~200 파이어 데미지 추가\n" +
                    "51~250 라이트닝 데미지 추가\n" +
                    "50~200 콜드 데미지 추가\n" +
                    "12% 라이프 획득(공격 명중시)\n" +
                    "몬스터 회복 저지\n" +
                    "+10 힘"
        ),
        RuneWord(
            id = 47,
            title = "배신(Treachery)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(13, 10, 20),
            options = "5% 기회로 레벨 15 페이드 시전(반격시)\n" +
                    "25% 기회로 레벨 15 베넘 시전 (타격시)\n" +
                    "+2 어쌔신 스킬\n" +
                    "+45% 공격속도 증가\n" +
                    "+20% 매우 빠른 회복속도 증가\n" +
                    " 콜드 저항력 +30%\n" +
                    "50% 몬스터로부터 얻는 골드 증가\n"
        ),
        RuneWord(
            id = 48,
            title = "평화 (Peace)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(13, 10, 11),
            options = "4% 기회로 레벨 5 슬로우 미사일 시전 (반격시)\n" +
                    "2% 기회로 레벨 15 발키리 시전 (타격시)\n" +
                    "+2 모든 아마존 스킬 레벨 상승\n" +
                    "+20% 매우 빠른 회복속도 증가\n" +
                    "+2 크리티컬 스트라이크\n" +
                    "콜드 저항력 +30%\n" +
                    "공격자가 받는 데미지 14"
        ),
        RuneWord(
            id = 49,
            title = "협박 (Duress)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(13, 22, 10),
            options = "+40% 매우 빠른 회복속도 증가\n" +
                    "+10~20% 증가된 데미지 (변함)\n" +
                    "37~133 콜드 데미지 추가\n" +
                    "15% 강한 타격 확률\n" +
                    "33% 상처 악화\n" +
                    "+150~200% 방어 상승 (변함)\n" +
                    "-20% 스태미나 소모 지연\n" +
                    "콜드 저항력 +45%\n" +
                    "라이트닝 저항력 +15%\n" +
                    "파이어 저항력 +15%\n" +
                    "포이즌 저항력 +15%"
        ),
        RuneWord(
            id = 50,
            title = "참나무의 심장, 오크의 심장 (Heart of the Oak)",
            socket = "지팡이, 메이스 (4소켓)",
            combinationRune = arrayListOf(18, 26, 21, 10),
            options = "+3 모든 스킬 상승\n" +
                    "+40% 매우 빠른 캐스팅 속도 증가\n" +
                    "+75% 데몬에게 주는 데미지 상승\n" +
                    "+100 데몬에 대한 공격등급 상승\n" +
                    "3~14 콜드 데미지 추가\n" +
                    "7% 마나 획득(공격 명중시)\n" +
                    "+10 민첩성\n" +
                    "라이프 회복 +20\n" +
                    "최대 마나 증가 15%\n" +
                    "모든 저항력 +30~40 (변함)\n" +
                    "레벨 4 오크 세이지 (25회)\n" +
                    "레벨 14 레이번 (60회)\n" +
                    "+50% 언데드에게 주는 데미지 상승"
        ),
        RuneWord(
            id = 51,
            title = "집행자, 법률 위반 (Lawbringer)",
            socket = "검, 해머, 셉터 (3소켓)",
            combinationRune = arrayListOf(11, 20, 18),
            options = "20% 기회로 레벨 15 디크리피파이 시전 (타격시)\n" +
                    "장착시 16~18레벨의 생츄어리 오라의 효과 적용 (변함)\n" +
                    "-50% 목표물의 방어\n" +
                    "150~210 파이어 데미지 추가\n" +
                    "130~180 콜드 데미지 추가\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "평화를 되찾기 위해 몬스터들을 무찔러라\n" +
                    "+200~250 원거리 공격 방어 (변함)\n" +
                    "+10 민첩성\n" +
                    "75% 몬스터로부터 얻는 골드 증가"
        ),
        RuneWord(
            id = 52,
            title = "얼음 (Ice)",
            socket = "보우, 크로스보우 (4소켓)",
            combinationRune = arrayListOf(11, 13, 31, 28),
            options = "100% 기회로 레벨 40 블리자드 시전 (당신의 레벨이 상\n" +
                    "승한 경우)\n" +
                    "25% 기회로 레벨 22 프로스트 노바 시전 (타격시)\n" +
                    "장착시 18레벨의 홀리 프리즈 오라의 효과 적용\n" +
                    "+20% 공격속도 증가\n" +
                    "+140~210% 증가된 데미지 (변함)\n" +
                    "목표물의 방어력 무시\n" +
                    "+25~30% 콜드 스킬 데미지에 대하여 (변함)\n" +
                    "-20% 적의 콜드 레지스트에 대하여\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "20% 치명적 공격\n" +
                    "3.125~309.375% 몬스터로부터 얻는 골드 증가 (캐릭터\n" +
                    "레벨에 비례해서)"
        ),
        RuneWord(
            id = 53,
            title = "정의의 손길 (Hand of Justice)",
            socket = "무기 (4소켓)",
            combinationRune = arrayListOf(29, 32, 11, 28),
            options = "00% 기회로 레벨 36 블레이즈 시전 (당신의 레벨이 상승한 경우)\n" +
                    "100% 기회로 레벨 48 메테오 시전 (당신이 죽은 경우)\n" +
                    "장착시 16레벨의 홀리 파이어 오라의 효과 적용\n" +
                    "+33% 공격속도 증가\n" +
                    "+280~330% 증가된 데미지 (변함)\n" +
                    "목표물의 방어력 무시\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "-20% 적의 파이어 레지스트에 대하여\n" +
                    "20% 치명적 공격\n" +
                    "목표물의 시야 감소(명중시)\n" +
                    "목표물 결빙 +3"
        ),
        RuneWord(
            id = 54,
            title = "영원, 불멸 (Eternity)",
            socket = "근접 무기 (5소켓)",
            combinationRune = arrayListOf(11, 30, 24, 12, 29),
            options = "(파괴안됨)\n" +
                    "+260~310% 증가된 데미지 (변함)\n" +
                    "+9 최소 데미지\n" +
                    "7% 라이프 획득(공격 명중시)\n" +
                    "20% 강한 타격 확률\n" +
                    "목표물의 시야 감소(명중시)\n" +
                    "목표물 속도 둔화 33%\n" +
                    "마나 재생 16%\n" +
                    "라이프 회복 +16\n" +
                    "결빙되지 않음\n" +
                    "30% 매직 아이템 얻을 확률 증가\n" +
                    "레벨 8 리바이브 (88회)"
        ),
        RuneWord(
            id = 55,
            title = "뼈 (Bone)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(12, 22, 22),
            options = "15% 기회로 레벨 10 본 아머 시전 (반격시)\n" +
                    "15% 기회로 레벨 10 본 스피어 시전 (타격시)\n" +
                    "+2 모든 네크로맨서 스킬 레벨 상승\n" +
                    "+100~150 마나(변함)\n" +
                    "모든 저항력 +30\n" +
                    "데미지 감소 7"
        ),
        RuneWord(
            id = 56,
            title = "용 (Dragon)",
            socket = "갑옷, 방패 (3소켓)",
            combinationRune = arrayListOf(29, 28, 12),
            options = "20% 기회로 레벨 18 베넘 시전 (반격시)\n" +
                    "12% 기회로 레벨 15 하이드라 시전 (타격시)\n" +
                    "장착시 14레벨의 홀리 파이어 오라의 효과 적용\n" +
                    "+360 방어\n" +
                    "+230 원거리 공격 방어\n" +
                    "+3~5 모든 능력치 (변함)\n" +
                    "+0.375~37.125 힘 (캐릭터 레벨에 비례해서)\n" +
                    "최대 마나 증가 5%\n" +
                    "+5% 최대 라이트닝 저항력\n" +
                    "데미지 감소 7"
        ),
        RuneWord(
            id = 57,
            title = "서약 (Oath)",
            socket = "검, 도끼, 메이스 (4소켓)",
            combinationRune = arrayListOf(13, 21, 23, 17),
            options = "(파괴안됨)\n" +
                    "30% 기회로 레벨 20 본 스피리트 시전 (타격시)\n" +
                    "+50% 공격속도 증가\n" +
                    "+210~340% 증가된 데미지 (변함)\n" +
                    "+75% 데몬에게 주는 데미지 상승\n" +
                    "+100 데몬에 대한 공격등급 상승\n" +
                    "몬스터 회복 저지\n" +
                    "+10 에너지\n" +
                    "+10~15 매직 흡수 (변함)\n" +
                    "레벨 16 하트 오브 울버린 (20회)\n" +
                    "레벨 17 아이언 골렘 (14회)"
        ),
        RuneWord(
            id = 58,
            title = "순백, 화이트 (White)",
            socket = "완드 (2소켓)",
            combinationRune = arrayListOf(14, 16),
            options = "+3 포이즌 & 본 스펠 (네크로맨서 전용)\n" +
                    "+20% 매우 빠른 캐스팅 속도 증가\n" +
                    "+2 본 스피어 (네크로맨서 전용)\n" +
                    "+4 스켈레톤 마스터리 (네크로맨서 전용)\n" +
                    "+3 본 아머 (네크로맨서 전용)\n" +
                    "몬스터가 달아남(명중시) 25%\n" +
                    "+10 생명력\n" +
                    "+13 마나\n" +
                    "마법 데미지 감소 4"
        ),
        RuneWord(
            id = 59,
            title = "추방, 망명 (Exile)",
            socket = "팔라딘 방패 (전용) (4소켓)",
            combinationRune = arrayListOf(26, 27, 24, 14),
            options = "타격시 15% 찬스로 레벨 5 라이프 탭 시전\n" +
                    "착용시 레벨 13-16 디피언스 오오라 (변함)\n" +
                    "2 오펜시브 오오라 스킬 증가 (팔라딘만)\n" +
                    "30% 빠른 블럭 확률\n" +
                    "타겟 얼림\n" +
                    "220-260% 디펜스 증가 (변함)\n" +
                    "라잎 재생 7\n" +
                    "5% 최대 콜드 레지 증가\n" +
                    "5% 최대 파이어 레지 증가\n" +
                    "25% 매직 찬스 증가\n" +
                    "4초에 내구력 1 회복"
        ),
        RuneWord(
            id = 60,
            title = "명예의 굴레 (Chains of honor)",
            socket = "갑옷 (4소켓)",
            combinationRune = arrayListOf(14, 22, 30, 24),
            options = "+2 모든 스킬 상승\n" +
                    "+200% 데몬에게 주는 데미지 상승\n" +
                    "+100% 언데드에게 주는 데미지 상승\n" +
                    "8% 라이프 획득(공격 명중시)\n" +
                    "+70% 방어 상승\n" +
                    "+20 힘\n" +
                    "라이프 회복 +7\n" +
                    "모든 저항력 +65\n" +
                    "데미지 감소 8%\n" +
                    "25% 매직 아이템 얻을 확률 증가"
        ),
        RuneWord(
            id = 61,
            title = "용맹, 용맹한 자 (LionHeart)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(15, 17, 19),
            options = "+20% 증가된 데미지\n" +
                    "+25 힘\n" +
                    "+15 민첩성\n" +
                    "+20 생명력\n" +
                    "+10 에너지\n" +
                    "+50 라이프\n" +
                    "모든 저항력 +30\n" +
                    "착용 가능 요구치 -15%"
        ),
        RuneWord(
            id = 62,
            title = "균열 (Rift)",
            socket = "폴암, 셉터 (4소켓)",
            combinationRune = arrayListOf(15, 18, 20, 25),
            options = "20% 기회로 레벨 16 토네이도 시전 (타격시)\n" +
                    "16% 기회로 레벨 21 프로즌 오브 시전 (공격시)\n" +
                    "20% 공격등급 추가 상승\n" +
                    "160~250 매직 데미지 추가\n" +
                    "60~180 파이어 데미지 추가\n" +
                    "+5~10 모든 능력치 (변함)\n" +
                    "+10 민첩성\n" +
                    "38% 데미지 마나로 흡수\n" +
                    "75% 몬스터로부터 얻는 골드 증가\n" +
                    "레벨 15 아이언 메이든 (40회)\n" +
                    "착용 가능 요구치 -20%"
        ),
        RuneWord(
            id = 63,
            title = "파멸 (Doom)",
            socket = "도끼, 폴암, 해머 (5소켓)",
            combinationRune = arrayListOf(15, 27, 22, 28, 32),
            options = "5% 기회로 레벨 18 볼케이노 시전 (타격시)\n" +
                    "장착시 12레벨의 홀리 프리즈 오라의 효과 적용\n" +
                    "+2 모든 스킬 상승\n" +
                    "+45% 공격속도 증가\n" +
                    "+330~370% 증가된 데미지 (변함)\n" +
                    "-(40~60%) 적의 콜드 레지스트에 대하여 (변함)\n" +
                    "20% 치명적 공격\n" +
                    "25% 상처 악화\n" +
                    "몬스터 회복 저지\n" +
                    "목표물 결빙 +3\n" +
                    "착용 가능 요구치 -20%"
        ),
        RuneWord(
            id = 64,
            title = "꿈 (Dream)",
            socket = "투구, 방패 (3소켓)",
            combinationRune = arrayListOf(16, 31, 21),
            options = "10% 기회로 레벨 15 컨퓨즈 시전 (반격시)\n" +
                    "장착시 15레벨의 홀리 쇼크 오라의 효과 적용\n" +
                    "+20~30% 매우 빠른 회복속도 증가 (변함)\n" +
                    "+30% 방어 상승\n" +
                    "+150~220 방어 (변함)\n" +
                    "+10 생명력\n" +
                    "+50 라이프 (방패 전용)\n" +
                    "최대 라이프 증가 5% (투구 전용)\n" +
                    "+0.625~61.875 마나 (캐릭터 레벨에 비례해서)\n" +
                    "모든 저항력 +5~20 (변함)\n" +
                    "12~25% 매직 아이템 얻을 확률 증가 (변함)"
        ),
        RuneWord(
            id = 65,
            title = "착란, 대표위원 (Delirium)",
            socket = "투구 (3소켓)",
            combinationRune = arrayListOf(20, 24, 16),
            options = "1% 기회로 레벨 50 대표위원 시전 (반격시)\n" +
                    "6% 기회로 레벨 14 마인드 블라스트 시전 (반격시)\n" +
                    "14% 기회로 레벨 13 테러 시전 (반격시)\n" +
                    "11% 기회로 레벨 18 컨퓨즈 시전 (타격시)\n" +
                    "+2 모든 스킬 상승\n" +
                    "+261 방어\n" +
                    "+10 생명력\n" +
                    "50% 몬스터로부터 얻는 골드 증가\n" +
                    "25% 매직 아이템 얻을 확률 증가\n" +
                    "레벨 17 어트랙트(60회)"
        ),
        RuneWord(
            id = 66,
            title = "긍지, 자존심 (Pride)",
            socket = "폴암 (4소켓)",
            combinationRune = arrayListOf(32, 29, 16, 28),
            options = "25% 기회로 레벨 17 파이어 월 시전 (반격시)\n" +
                    "장착시 16~20레벨의 컨센트레이션 오라의 효과 적용 (변함)\n" +
                    "260~300% 공격등급 추가 상승 (변함)\n" +
                    "+1~99% 데몬에게 주는 데미지 상승 (캐릭터 레벨에 비례해서)\n" +
                    "50~280 라이트닝 데미지 추가\n" +
                    "20% 치명적 공격\n" +
                    "목표물의 시야 감소(명중시)\n" +
                    "목표물 결빙 +3\n" +
                    "+10 생명력\n" +
                    "라이프 회복 +8\n" +
                    "875~185.625% 몬스터로부터 얻는 골드 증가 (캐릭터 레벨에 비례해서)"
        ),
        RuneWord(
            id = 67,
            title = "진노, 격노 (Wrath)",
            socket = "원거리 무기 (4소켓)",
            combinationRune = arrayListOf(21, 17, 30, 23),
            options = "30% 기회로 레벨 1 디크리피파이 시전 (타격시)\n" +
                    "5% 기회로 레벨 10 라이프 탭 시전 (타격시)\n" +
                    "+375% 데몬에게 주는 데미지 상승\n" +
                    "+100 데몬에 대한 공격등급 상승\n" +
                    "+250~300% 언데드에게 주는 데미지 상승 (변함)\n" +
                    "85~120 매직 데미지 추가\n" +
                    "41~240 라이트닝 데미지 추가\n" +
                    "20% 강한 타격 확률\n" +
                    "몬스터 회복 저지\n" +
                    "+10 에너지\n" +
                    "결빙되지 않음"
        ),
        RuneWord(
            id = 68,
            title = "스톤, 돌 (Stone)",
            socket = "갑옷 (4소켓)",
            combinationRune = arrayListOf(13, 22, 21, 17),
            options = "+60% 매우 빠른 회복 속도 증가\n" +
                    "+250~290% 방어 상승 (변함)\n" +
                    "+300 원거리 공격 방어\n" +
                    "+16 힘\n" +
                    "+16 생명력\n" +
                    "+10 에너지\n" +
                    "모든 저항력 +15\n" +
                    "레벨 16 몰튼 보울더 (80회)\n" +
                    "레벨 16 클레이 골렘 (16회)"
        ),
        RuneWord(
            id = 69,
            title = "성역 (Sanctuary)",
            socket = "방패 (3소켓)",
            combinationRune = arrayListOf(18, 18, 23),
            options = "+20% 매우 빠른 회복속도 증가\n" +
                    "+20% 매우 빠른 방어속도 증가\n" +
                    "20% 공격저지 성공율 증가\n" +
                    "+130~160% 방어 상승 (변함)\n" +
                    "+250 원거리 공격 방어\n" +
                    "+20 민첩성\n" +
                    "모든 저항력 +50~70 (변함)\n" +
                    "마법 데미지 감소 7\n" +
                    "레벨 12 슬로우 미사일 (60회)"
        ),
        RuneWord(
            id = 70,
            title = "파괴 (Destruction)",
            socket = "폴암, 검 (5소켓)",
            combinationRune = arrayListOf(26, 28, 30, 31, 18),
            options = "23% 기회로 레벨 12 볼케이노 시전 (타격시)\n" +
                    "5% 기회로 레벨 23 몰튼 보울더 시전 (타격시)\n" +
                    "100% 기회로 레벨 45 메테오 시전 (당신이 죽은 경우)\n" +
                    "15% 기회로 레벨 22 노바 시전 (공격시)\n" +
                    "+350% 증가된 데미지\n" +
                    "목표물의 방어력 무시\n" +
                    "100~180 매직 데미지 추가\n" +
                    "7% 마나 획득(공격 명중시)\n" +
                    "20% 강한 타격 확률\n" +
                    "20% 치명적 공격\n" +
                    "몬스터 회복 저지\n" +
                    "+10 민첩성"
        ),
        RuneWord(
            id = 71,
            title = "어스름, 우울 (Gloom)",
            socket = "갑옷 (3소켓)",
            combinationRune = arrayListOf(19, 22, 21),
            options = "15% 기회로 레벨 3 딤 비젼 시전 (반격시)\n" +
                    "+10% 매우 빠른 회복 속도 증가\n" +
                    "+200~260% 방어 상승 (변함)\n" +
                    "+10 힘\n" +
                    "모든 저항력 +45\n" +
                    "결빙 시간 1/2 감소\n" +
                    "5% 데미지 마나로 흡수\n" +
                    "-3 시야 증가"
        ),
        RuneWord(
            id = 72,
            title = "혼돈 (Chaos)",
            socket = "클러 (3소켓)",
            combinationRune = arrayListOf(19, 27, 22),
            options = "9% 기회로 레벨 11 프로즌 오브 시전 (타격시)\n" +
                    "11% 기회로 레벨 9 차지드 볼트 시전 (타격시)\n" +
                    "+35% 공격속도 증가\n" +
                    "+290~340% 증가된 데미지 (변함)\n" +
                    "216~471 매직 데미지 추가\n" +
                    "25% 상처 악화\n" +
                    "+1 훨윈드\n" +
                    "+10 힘\n" +
                    "+15 라이프 상승(적 제거시)"
        ),
        RuneWord(
            id = 73,
            title = "왕 시해자 (Kingslayer)",
            socket = "검, 도끼 (4소켓)",
            combinationRune = arrayListOf(23, 22, 25, 19),
            options = "+30% 공격속도 증가\n" +
                    "+230~270% 증가된 데미지 (변함)\n" +
                    "-25% 목표물의 방어\n" +
                    "20% 공격등급 추가 상승\n" +
                    "33% 강한 타격 확률\n" +
                    "50% 상처 악화\n" +
                    "+1 벤젠스\n" +
                    "몬스터 회복 저지\n" +
                    "+10 힘\n" +
                    "40% 몬스터로부터 얻는 골드 증가"
        ),
        RuneWord(
            id = 74,
            title = "마지막 소망 (Last Wish)",
            socket = "검, 해머, 도끼 (6소켓)",
            combinationRune = arrayListOf(31, 23, 31, 29, 31, 30),
            options = "6% 기회로 레벨 11 페이드 시전 (반격시)\n" +
                    "10% 기회로 레벨 18 라이프 탭 시전 (타격시)\n" +
                    "20% 기회로 레벨 20 차지드 볼트 시전 (공격시)\n" +
                    "장착시 17레벨의 마이트 오라의 효과 적용\n" +
                    "+330~375% 증가된 데미지 (변함)\n" +
                    "목표물의 방어력 무시\n" +
                    "60~70% 강한 타격 확률 (변함)\n" +
                    "몬스터 회복 저지\n" +
                    "목표물의 시야 감소(명중시)\n" +
                    "(캐릭터 레벨당 0.5) 0.5~49.5% 매직 아이템 얻을 확률 증가\n" +
                    "(캐릭터 레벨에 비례해서)"
        ),
        RuneWord(
            id = 75,
            title = "낙인, 인두 (Brand)",
            socket = "보우, 크로스보우 (4소켓)",
            combinationRune = arrayListOf(31, 28, 23, 25),
            options = "35% 기회로 레벨 14 앰플리파이 데미지 시전 (반격시)\n" +
                    "100% 기회로 레벨 18 본 스피어 시전 (타격시)\n" +
                    "폭발 화살 발사\n" +
                    "+260~340% 증가된 데미지 (변함)\n" +
                    "목표물의 방어력 무시\n" +
                    "20% 공격등급 추가 상승\n" +
                    "+280~330% 데몬에게 주는 데미지 상승 (변함)\n" +
                    "20% 치명적 공격\n" +
                    "몬스터 회복 저지\n" +
                    "적을 밀쳐냄"
        ),
        RuneWord(
            id = 76,
            title = "무한의 공간 (Infinity)",
            socket = "폴암 (4소켓)",
            combinationRune = arrayListOf(30, 23, 30, 24),
            options = "50% 기회로 레벨 20 체인 라이트닝 시전 (당신이 적을 죽인 경우)\n" +
                    "장착시 12레벨의 컨빅션 오라의 효과 적용\n" +
                    "+35% 매우 빠른 달리기/걷기 속도 증가\n" +
                    "+255~325% 증가된 데미지 (변함)\n" +
                    "-(45~55)% 적의 라이트닝 레지스트에 대하여 (변함)\n" +
                    "40% 강한 타격 확률\n" +
                    "몬스터 회복 저지\n" +
                    "+0.5~49.5 생명력 (캐릭터 레벨에 비례해서)\n" +
                    "30% 매직 아이템 얻을 확률 증가\n" +
                    "레벨 21 사이클론 아머 (30회)"
        ),
        RuneWord(
            id = 77,
            title = "불사조 (Phoenix)",
            socket = "무기, 방패 (4소켓)",
            combinationRune = arrayListOf(26, 26, 28, 31),
            options = "100% 기회로 레벨 40 블레이즈 시전 (당신의 레벨이 상승한 경우)\n" +
                    "40% 기회로 레벨 22 파이어스톰 시전 (타격시)\n" +
                    "장착시 10~15레벨의 리뎀션 오라의 효과 적용 (변함)\n" +
                    "+350~400% 증가된 데미지 (변함)\n" +
                    "-28% 적의 파이어 레지스트에 대하여\n" +
                    "+350~400 원거리 공격 방어 (변함)\n" +
                    "+50 라이프\n" +
                    "+5% 최대 라이트닝 저항력\n" +
                    "+10% 최대 파이어 저항력\n" +
                    "+15~21 파이어 흡수 (변함)"
        ),
        RuneWord(
            id = 78,
            title = "스피리트, 영혼 (Spirit)",
            socket = "검, 방패(4소켓)",
            combinationRune = arrayListOf(7, 10, 9, 11),
            options = "+2 모든 스킬 상승\n" +
                    "+25~35% 매우 빠른 캐스팅 속도 증가 (변함)\n" +
                    "+55% 매우 빠른 회복속도 증가\n" +
                    "+250 원거리 공격 방어\n" +
                    "+22 생명력\n" +
                    "+89~112 마나 (변함)\n" +
                    "콜드 저항력 +35%\n" +
                    "라이트닝 저항력 +35%\n" +
                    "포이즌 저항력 +35%\n" +
                    "+3~8 매직 흡수 (변함)\n" +
                    "공격자가 받는 데미지 14"
        )
    )
}