/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author user
 */
public class ArrayList <E> implements List <E>, Iterable<E>, Serializable{
    private E[] arreglo;
    private int capacidad=100;
    private int tam;
    //private static final long serialVersionUID = 8799656478674716638L;
    
    
    public ArrayList(){
        arreglo=(E[]) new Object[capacidad];
    }
    public ArrayList(int capacidad){
        this.capacidad = capacidad;
        arreglo =  (E[]) new Object[capacidad];
        tam = 0;
    }
    private void crecerArreglo(){
        capacidad = capacidad*2;
        E[] arreglo2 =  (E[]) new Object[capacidad];
        for (int i=0; i<tam; i++){
            arreglo2[i] = arreglo[i];
        }
        arreglo = arreglo2;
    }

    @Override
    public boolean addFirst(E e) {
        if (e==null){
            return false;
        }
        if (tam == 0){
            arreglo[0] = e;
            tam = 1;
            return true;
        }
        if (tam == capacidad){
            crecerArreglo();
        }
        for (int i=tam-1; i>0; i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = e;
        tam++;
        return true;
    }

    @Override
    public boolean addLast(E e) {
        if(e==null){
            return false;
        }
        if (tam == capacidad){
            crecerArreglo();
        }
        if (arreglo[tam]==null){
            arreglo[tam]=e;
            tam++;
        }
//        if (arreglo[tam++]==null){
//            arreglo[tam++]=e;
//            tam++;
//        }
        
        return true;
    }

    @Override
    public E getFirst() {
        if (isEmpty()){
            return null;
        }
        return arreglo[0];
    }

    @Override
    public E getLast() {
        if (isEmpty()){
            return null;
        }
        return arreglo[tam-1];
        }

    @Override
    public int indexOf(E e) {
        if (isEmpty()){
            return -1;
        }
        if (e==null){
            return 0;//revisar porque al retornar cero, se estaría dicicendo que si está en la posicion cero
            //sería -1, tambien?
        }
        for (int i =0; i<tam;i++){
            if (arreglo[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return tam;
    }

    @Override
    public boolean removeLast() {
       if (isEmpty()){
            return false;
        }
        E[] arreglo2 =  (E[]) new Object[capacidad];
        for (int i =0;i<tam-1;i++){
            arreglo2[i]=arreglo[i];
        }
        arreglo=arreglo2;
        tam--;
        return true;
        }

    @Override
    public boolean removeFirst() {
        if (isEmpty()){
            return false;
        }
        E[] arreglo2 =  (E[]) new Object[capacidad];
        for(int i=0;i<tam-1;i++){
            arreglo2[i]=arreglo[i+1];
        }
        arreglo=arreglo2;
        tam--;
        return true;
    }

    @Override
    public boolean insert(int index, E e) {
        if (index<0 || index>tam-1){
            return false;
        }
        if (isEmpty()){
            return false;
        }
        if (e==null){
            return false;
        }
        for(int i=index;i<tam;i++){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[index]=e;
        tam++;
     
    
        return true;
    }

    @Override
    public boolean set(int index, E e) {
        if(e==null){
            return false;
        }
        if (index<0 || index>tam-1){
            System.out.println("indice no válido");
        }
        arreglo[index]=e;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return tam==0;
    }

    @Override
    public E get(int index) {
        if (index<0 || index>tam-1){
            System.out.println("indice no válido");
        }
        return arreglo[index];
    }

    @Override
    public boolean contains(E e) {
       if (e==null){
            return false;
        }
        for (int i=0;i<tam;i++){
            if (Objects.equals(arreglo[i],e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        if (index<0 || index>tam-1){
            System.out.println("indice no válido");
        }
        for(int i=index;i<tam-1;i++){
          arreglo[i]=arreglo[i+1]; 
        }
        tam--;
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> itera = new Iterator(){
            int i=0;
            @Override
            public boolean hasNext() {
                return i<tam && tam >=0;
            }

            @Override
            public Object next() {
                return arreglo[i++];
            }
            
        };
        return itera;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < (tam-1); i++){
            sb.append(this.arreglo[i]).append(",");
        }
        sb.append(this.arreglo[tam]);
        return sb.toString();
    }
    
    public void concatenar(ArrayList<E>l2){
        for(int i=0; i<l2.size(); i++){
            this.addLast(l2.get(i));
        }
    
    }
    
    public ArrayList<E> eliminarRepetidos(){
        ArrayList<E> ln = new ArrayList<>();
        for(int i=0; i<this.size(); i++){
            if(ln.indexOf(this.get(i)) == -1){
                ln.addLast(this.get(i));
            }
        }
    
        return ln;
    }
    
    public List<E> findAll(E element, Comparator<E> cmp) {
        List<E> resultado = new ArrayList<>();
        for (E e : this) {
            if (cmp.compare(e, element) == 0) {
                resultado.addLast(e);
            }
        }
        return resultado;
    }

    public List<E> findLower(E element, Comparator<E> cmp) {
        List<E> resultado = new ArrayList<>();
        for (E e : this) {
            if (cmp.compare(e, element) < 0) {
                resultado.addLast(e);
            }
        }
        return resultado;
    }

    public List<E> findGreater(E element, Comparator<E> cmp) {
        List<E> resultado = new ArrayList<>();
        for (E e : this) {
            if (cmp.compare(e, element) > 0) {
                resultado.addLast(e);
            }
        }
        return resultado;
    }

    public List<E> findBetween(E element1, E element2, Comparator<E> cmp) {
        List<E> resultado = new ArrayList<>();
        for (E e : this) {
            if (cmp.compare(e, element1) >= 0 && cmp.compare(e, element2) <= 0) {
                resultado.addLast(e);
            }
        }
        return resultado;
    }
    
    
}
