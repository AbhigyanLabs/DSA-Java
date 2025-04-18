Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.Display();
        st.pop();
        st.Display();
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(34);
        st.push(36);
        st.Display();
        st.push(84);