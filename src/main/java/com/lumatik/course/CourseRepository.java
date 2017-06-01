package com.lumatik.course;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by mgull on 5/31/2017.
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

    @RestResource(rel = "title-contains", path = "containsTitle") // alters url
    Page<Course> findByTitleContaining(@Param("title") String title, Pageable page);
    // example: http://localhost:8080/courses/search/findByTitleContaining?title=Java&size=5
    // http://localhost:8080/courses/search/findByTitleContaining?title=Java&page=4&size=5

}
