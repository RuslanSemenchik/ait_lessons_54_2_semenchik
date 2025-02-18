package de.ait.homework38;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        List<Video> videos = List.of(
                new Video("Как научиться программировать", "IT Channel", 1500000, 12000, 720, "Образование", true),
                new Video("Лучшие моменты матча", "Sports Channel", 500000, 8000, 600, "Спорт", false),
                new Video("Новый трек 2025", "Music Channel", 3000000, 25000, 240, "Музыка", true),
                new Video("Обзор новой игры", "Gaming Channel", 2000000, 15000, 900, "Игры", true),
                new Video("Как приготовить пиццу", "Cooking Channel", 800000, 10000, 1200, "Кулинария", false)
        );

        //1.Отфильтруйте видео, которые имеют более 1 миллиона просмотров, и соберите их в список.
        //Подсказка: Используйте filter для отбора видео и collect для сбора в список.
        List<Video>resultViews = videos.stream()
                .filter(video -> video.getViews()>1000000)
                .collect(Collectors.toList());
        System.out.println(resultViews);

        //2. Создайте список названий видео, которые длятся более 10 минут.
        //Подсказка: Преобразуйте длительность из секунд в минуты (1 минута = 60 секунд). Используйте map для получения названий

        List<String>duration10min = videos.stream()
                .filter(video -> (video.getDuration())/60 > 10)
                .map(Video::getTitle)
                .collect(Collectors.toList());
        System.out.println(duration10min);

        //3. Найдите все уникальные категории видео.
        //Подсказка: Используйте map для получения категорий и distinct для удаления дубликатов.
        List<String>categories = videos.stream()
                .map(Video::getCategory)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(categories);

        //4.Создайте список названий видео, преобразовав их в верхний регистр.
        // Подсказка: Используйте map для преобразования строк в верхний регистр.
        List<String>titleListToUpper = videos.stream()
                .map(Video::getTitle)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(titleListToUpper);

        // 5.Создайте список объектов, содержащих только название видео и количество лайков.
        //Подсказка: Создайте новый класс или используйте Map.Entry для хранения пар "название-лайки".
        List<Map.Entry<String,Integer>>titleAndLikesList = videos.stream()
                .map(video -> Map.entry(video.getTitle(),video.getLikes()))
                .collect(Collectors.toList());
        System.out.println(titleAndLikesList);

        //6.Отсортируйте видео по количеству просмотров в порядке убывания и выведите первые 5.
        //Подсказка: Используйте sorted с компаратором и limit для ограничения количества элементов.
        List<Video>views5 = videos.stream()
                .sorted(Comparator.comparingInt(Video::getViews).reversed())
                .limit(4)
                .collect(Collectors.toList());

        System.out.println(views5);

        // 7.Отсортируйте видео по длительности в порядке возрастания и выведите первые 3.
        //Подсказка: Аналогично предыдущему заданию, но сортируйте по длительности.
        List<Video>durations3 = videos.stream()
                .sorted(Comparator.comparingInt(Video::getDuration))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(durations3);

        //8. Посчитайте общее количество видео в списке.
        //Подсказка: Используйте метод count.
        long count = videos.stream().count();
        System.out.println(count);

        //9.Найдите видео с максимальным количеством лайков.
        //Подсказка: Используйте max с компаратором по количеству лайков.
        Optional<Video> maxLikes = videos.stream()
                .max(Comparator.comparingInt(Video::getLikes));

        System.out.println(maxLikes);

        //10. Найдите видео с минимальной длительностью.
        //Подсказка: Используйте min с компаратором по длительности.
        Optional<Video> minDurations = videos.stream()
                .min(Comparator.comparingInt(Video::getDuration));

        System.out.println(minDurations);

        //11. Проверьте, есть ли хотя бы одно видео с количеством просмотров более 10 миллионов.
        //Подсказка: Используйте anyMatch с условием на количество просмотров.
        boolean views1000000 = videos.stream()
                .allMatch(s->s.getViews()>1000000);

        System.out.println(views1000000);

        //12. Проверьте, все ли видео в категории "Музыка" монетизированы.
        //Подсказка: Используйте filter для отбора видео категории "Музыка" и allMatch для проверки монетизации.
        boolean categoryMonetiz = videos.stream()
                .filter(s->s.getCategory().equals("Музыка"))
                .allMatch(s->s.isMonetized() ==true);

        System.out.println(categoryMonetiz);
















    }
}






