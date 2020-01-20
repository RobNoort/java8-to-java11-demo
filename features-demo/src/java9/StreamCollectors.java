package java9;

import java9.helpers.Blog;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        filteringCollector();
        flatmappingCollector();
    }

    private static void filteringCollector() {

        List<Integer> numbers = List.of(1, 2, 3, 5, 5);

        // Using filter
        Map<Integer, Long> result = numbers.stream()
                .filter(val -> val > 3)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(String.format("Result : %s", result));

        // using fitering and group by
        result = numbers.stream()
                .collect(Collectors.groupingBy(i -> i,
                        Collectors.filtering(val -> val > 3, Collectors.counting())));
        System.out.println(String.format("Result : %s", result));
    }

    private static void flatmappingCollector() {
        Blog blog1 = new Blog("1", List.of("Nice", "Very Nice"));
        Blog blog2 = new Blog("2", List.of("Disappointing", "Ok", "Could be better"));
        Blog blog3 = new Blog("3", List.of("Superb", "Ok", "Improving", "Stop bothering"));
        List<Blog> blogs = List.of(blog1, blog2, blog3);

        // mapping
        Map<String, List<List<String>>> authorCommentsMapping = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName,
                        Collectors.mapping(Blog::getComments, Collectors.toList())));
        System.out.println("mapping");
        System.out.println(String.format("Number of blogs : %s", authorCommentsMapping.size()));
        System.out.println(String.format("Number of comments for author 1: %s", authorCommentsMapping.get("1").get(0).size()));
        System.out.println(String.format("Number of comments for author 2: %s", authorCommentsMapping.get("2").get(0).size()));
        System.out.println(String.format("Number of comments for author 3: %s", authorCommentsMapping.get("3").get(0).size()));

        Map<String, List<String>> authorCommentsFlatMapping = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName,
                        Collectors.flatMapping(blog -> blog.getComments().stream(),
                                Collectors.toList())));

        // The intermediate collection is removed with flatMapping as it gives a direct stream of the comment list to be mapped to the collector's container.
        System.out.println("flatmapping");
        System.out.println(String.format("Number of blogs : %s", authorCommentsFlatMapping.size()));
        System.out.println(String.format("Number of comments for author 1: %s", authorCommentsFlatMapping.get("1").size()));
        System.out.println(String.format("Number of comments for author 2: %s", authorCommentsFlatMapping.get("2").size()));
        System.out.println(String.format("Number of comments for author 3: %s", authorCommentsFlatMapping.get("3").size()));
    }
}
