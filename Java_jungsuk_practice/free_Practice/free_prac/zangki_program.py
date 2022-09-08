TC = 3
# TC = input()            #테스트케이스 숫자 입력

# Zang_N = input()
Zang_N = 8                #장기 크기 입력



#포(Po) 변수 생성
Po = "X"

#일반 장기알 변수 생성
target = "H"

#다른 포 변수 생성
venom = "Y"


#먹을 수 있는 장기말 수 판독 함수
def zangki_pro(LI):
    h_count = 0
    cnt = 0
    front_boolean = True
    
    for i in range(len(LI)):
        if ((front_boolean == False) and (h_count >= 2)):
            break
        elif front_boolean == True :
            if LI[i] == "H" :
                h_count += 1
                continue
            elif LI[i] == "Y" :
                h_count *= 0
                continue
            elif LI[i] == "X" :
                if h_count >= 2 :
                    cnt += 1
                h_count = 0
                front_boolean = False
                continue
            else :
                continue
        else :
            if LI[i] == "H" :
                h_count += 1
                continue
            elif LI[i] == "Y" :
                break
            else :
                continue
    
    if h_count >= 2 :
        cnt += 1
    
    return cnt


#프로그램 실행
for z in range(TC):
    
    zangki=[]
    
    for i in range(Zang_N):
        zangki.append(list(input().split()))
    
    for i in range(len(zangki)) :
        if (Po in zangki[i]) :
            x = i
            y = zangki[i].index(Po)
            break
            
    x_li = zangki[x]
    
    y_li = []
    for i in range(Zang_N) :
        y_li.append(zangki[i][y])
        
    h_count = 0
    cnt = 0
    
    print("[[x_li]]")
    print(x_li)
    print("[[y_li]]")
    print(y_li)
    
    cnt += zangki_pro(x_li)
    cnt += zangki_pro(y_li)
    
    print(f"case{z+1} : {cnt}")
    print("=======================")   