package com.virtualadrian.base;

import org.springframework.data.domain.Page;

import java.io.Serializable;

/**
 * The interface Base crud service.
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
public interface IBaseCrudService<M, ID extends Serializable> {

    /**
     * Find m.
     *
     * @param id the id
     * @return the m
     */
    M find(ID id);;

    /**
     * All iterable.
     *
     * @return the iterable
     */
    Iterable<M> findall();

    /**
     * All iterable.
     *
     * @param page     the page
     * @param pageSize the page size
     * @return the iterable
     */
    Page<M> findall(int page, int pageSize);

    /**
     * All iterable.
     *
     * @param example  the example
     * @param page     the page
     * @param pageSize the page size
     * @return the iterable
     */
    Page<M> findall(M example, int page, int pageSize);

    /**
     * Create m.
     *
     * @param creating the creating
     * @return the m
     */
    M create(M creating);

    /**
     * Create iterable.
     *
     * @param creating the creating
     * @return the iterable
     */
    Iterable<M> create(Iterable<M> creating);

    /**
     * Update m.
     *
     * @param updating the updating
     * @return the m
     */
    M update(M updating);

    /**
     * Update iterable.
     *
     * @param updating the updating
     * @return the iterable
     */
    Iterable<M> update(Iterable<M> updating);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(ID id);
}
