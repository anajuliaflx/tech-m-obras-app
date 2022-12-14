import Nav from '../src/components/Nav'
import Footer from '../src/components/patterns/Footer/index'
import HeadComponent from '../src/components/patterns/Head/index'
import TableStructure from '../src/components/TableConstruction'
import styles from '../styles/Home.module.css'

export default function Home() {
  return (
    <div >
    <HeadComponent/>
        <Nav/>
      <TableStructure style={styles.container}/>
    <Footer style={styles.footer}/>
    </div>
  )
}
