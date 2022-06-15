package com.example.backjun.test;

public class P17683 {
    public String solution(String m, String[] musicinfos) {
        int maxPlayTime = -1;
        String answer = "";

        // 멜로디에 들어있는 # 붙은 음 치환
        m = changeMelody(m);

        // 정보를 하나씩 대입해준다
        for (String musicInfo : musicinfos) {

            // ","으로 split하여 정보를 나눈다 시작, 끝, 제목, 코드
            String[] info = musicInfo.split(",");

            // 제목
            String title = info[2];
            // 음악의 코드
            String melodyInfo = info[3];
            // 시작시간
            String[] timeInfo = info[0].split(":");
            // 시작 시간 분단위로 변환
            int start = Integer.valueOf(timeInfo[0]) * 60 + Integer.valueOf(timeInfo[1]);
            // 끝 시간 정의
            int end = 0;
            // 끝시간을 ":"으로 시간과 분을 분리
            timeInfo = info[1].split(":");
            // 끝난 시간 분단위로 변환 -> (시간 * 60분) + 분
            end = Integer.valueOf(timeInfo[0]) * 60 + Integer.valueOf(timeInfo[1]);

            // 음악의 지속 시간 구함 = 끝난시간 - 시작시간
            int play = end - start;

            // 음악의 길이(음악의 코드 1개당 1분)보다 재생 지속 시간이 길 때
            if (play > melodyInfo.length()) {
                StringBuilder newMelody = new StringBuilder();

                // 나눈 몫 만큼 악보 처음부터 반복 (음악의 지속 시간 / 음악의 길이(음악의 코드 1개당 1분))
                for (int i = 0; i < play / melodyInfo.length(); i++)
                    // 스프링 버퍼 -> 기존의 문자열에 append로 문자열 뒤에 문자열 붙임 ex) a + b => ab
                    newMelody.append(melodyInfo);

                // 나머지만큼 악보에서 잘라서 붙임
                //substring (앞에서부터 - 0부터 시작, 몇번째 까지 -1)호출
                // -> 첫번째부터, 음악의 길이/음악의 길이 (음악의 코드 1개당 1분)를 했을 때 나오는 나마저 값까지
                newMelody.append(melodyInfo.substring(0, play % melodyInfo.length()));
                // String으로 형변환
                melodyInfo = newMelody.toString();
            } else {
                // 재생 지속 시간 만큼만 재생
                melodyInfo = melodyInfo.substring(0, play);
            }

            // 조건이 일치하는 음악이 여러개면
            // 재생된 시간이 제일 긴 음악 제목을 반환해야 하기 때문에
            // 조건에 멜로디 포함뿐만 아니라, 재생된 시간가지 비교
            if (melodyInfo.contains(m) && play > maxPlayTime) {
                answer = title;
                maxPlayTime = play;
            }


        }

        return maxPlayTime != -1 ? answer : "(None)";
    }

    String changeMelody(String oldMelody) {
        oldMelody = oldMelody.replaceAll("C#", "H");
        oldMelody = oldMelody.replaceAll("D#", "I");
        oldMelody = oldMelody.replaceAll("F#", "J");
        oldMelody = oldMelody.replaceAll("G#", "K");
        String newMelody = oldMelody.replaceAll("A#", "L");

        return newMelody;

    }


}
