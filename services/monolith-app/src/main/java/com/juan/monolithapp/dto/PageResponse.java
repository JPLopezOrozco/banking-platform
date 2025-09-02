package com.juan.monolithapp.dto;

import java.util.List;

public record PageResponse<T>(
        List<T> content,
        long totalElements,
        int totalPages,
        int number,
        int size,
        boolean first,
        boolean last
) {
    public static <T> PageResponse<T> from(org.springframework.data.domain.Page<T> p) {
        return new PageResponse<>(p.getContent(), p.getTotalElements(), p.getTotalPages(),
                p.getNumber(), p.getSize(), p.isFirst(), p.isLast());
    }
}
