import java.util.*;


class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 총 재생 수 저장
        Map<String, Integer> genrePlayCount = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);
        }

        // 2. 장르별 노래 리스트 저장 (int[] 배열 사용: {index, play})
        Map<String, List<int[]>> genreToSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            if (!genreToSongs.containsKey(genre)) {
                genreToSongs.put(genre, new ArrayList<>());
            }

            genreToSongs.get(genre).add(new int[]{i, play}); // index, play 저장
        }

        // 3. 장르를 총 재생 수 기준으로 정렬
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        Collections.sort(sortedGenres, new Comparator<String>() {
            public int compare(String g1, String g2) {
                return genrePlayCount.get(g2) - genrePlayCount.get(g1);
            }
        });

        List<Integer> result = new ArrayList<>();

        // 4. 각 장르에서 재생 수 기준으로 노래 정렬 후 최대 2개 선택
        for (String genre : sortedGenres) {
            List<int[]> songs = genreToSongs.get(genre);

            // 정렬: 재생 수 내림차순, 재생 수 같으면 고유번호 오름차순
            Collections.sort(songs, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    if (a[1] == b[1]) return a[0] - b[0];
                    return b[1] - a[1];
                }
            });

            // 최대 2곡 선택
            for (int i = 0; i < songs.size() && i < 2; i++) {
                result.add(songs.get(i)[0]); // 고유번호(index)만 추가
            }
        }

        // 5. 결과 리스트를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}

/*
1. 장르별 총 재생수를 저장 해시맵 초기화
2. 장르별 노래 리스트 저장 해시맵 초기화
3. 장르별 총 재생수 기준으로 해시맵 정렬
4.장르별 노래 리스트 정렬
    - 기준 1. 재생 수 기준 내림차순
    - 기준 2. 고유번호 기준 오름차순
5. 장르당 최대 두 개 씩 index를 정답 리스트에 추가
*/
/*
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 총 재생 수 저장
        HashMap<String, Integer> genrePlayCount = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            if (genrePlayCount.containsKey(genre)) {
                genrePlayCount.put(genre, genrePlayCount.get(genre) + play);
            } else {
                genrePlayCount.put(genre, play);
            }
        }

        // 2. 장르별 노래 목록 저장 (고유번호와 재생수)
        HashMap<String, ArrayList<Song>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            if (!genreSongs.containsKey(genre)) {
                genreSongs.put(genre, new ArrayList<Song>());
            }

            genreSongs.get(genre).add(new Song(i, play));
        }

        // 3. 장르를 총 재생 수 기준으로 정렬
        ArrayList<String> genreList = new ArrayList<>(genrePlayCount.keySet());
        Collections.sort(genreList, new Comparator<String>() {
            public int compare(String g1, String g2) {
                return genrePlayCount.get(g2) - genrePlayCount.get(g1);
            }
        });

        // 4. 각 장르에서 노래를 재생 수 기준으로 정렬 후 최대 2개 선택
        ArrayList<Integer> result = new ArrayList<>();

        for (String genre : genreList) {
            ArrayList<Song> songs = genreSongs.get(genre);
            Collections.sort(songs); // Song 클래스에 compareTo 정의돼 있음

            // 최대 2개만 추가
            for (int i = 0; i < songs.size() && i < 2; i++) {
                result.add(songs.get(i).index);
            }
        }

        // 5. ArrayList를 int[] 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}

// 🧱 Song 클래스
class Song implements Comparable<Song> {
    int index; // 고유번호
    int play;  // 재생 수

    public Song(int index, int play) {
        this.index = index;
        this.play = play;
    }

    // 정렬 기준: 재생 수 내림차순, 같으면 고유번호 오름차순
    public int compareTo(Song other) {
        if (this.play == other.play) {
            return this.index - other.index;
        }
        return other.play - this.play;
    }
}
*/